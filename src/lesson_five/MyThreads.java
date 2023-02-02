package lesson_five;

import java.util.Arrays;

public class MyThreads {
  static final int size = 10000000;
  static final int h = size / 2;

  public void createArray() {
    var arr = new float[size];
    Arrays.fill(arr, 1);
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
    System.out.printf("One thread time: %d\n", System.currentTimeMillis() - startTime);
  }

  public void createArrayInThreads() {
    var arr = new float[size];
    Arrays.fill(arr, 1);

    long startTime = System.currentTimeMillis();
    var arrOne = new float[h];
    var arrTwo = new float[h];
    System.arraycopy(arr, 0, arrOne, 0, h);
    System.arraycopy(arr, h, arrTwo, 0, h);

    var threadOne = new Thread(() -> {
      for (int i = 0; i < arrOne.length; i++) {
        arrOne[i] = (float) (arrOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
      }
      System.arraycopy(arrOne, 0, arr, 0, h);
    });
    var threadTwo = new Thread(() -> {
      for (int i = 0; i < arrTwo.length; i++) {
        arrTwo[i] = (float) (arrTwo[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
      }
      System.arraycopy(arrTwo, 0, arr, h, h);
    });


    threadOne.start();
    threadTwo.start();
    try {
      threadOne.join();
    } catch (InterruptedException e) {
      System.out.println("Прервался первый поток");
      e.printStackTrace();
    }
    try {
      threadTwo.join();
    } catch (InterruptedException e) {
      System.out.println("Прервался второй поток");
      e.printStackTrace();
    }
    System.out.printf("Two thread time: %d ms.\n", System.currentTimeMillis() - startTime);


  }
}
