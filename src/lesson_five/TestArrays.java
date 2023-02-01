package lesson_five;

import java.util.Arrays;

public class TestArrays {
  static final int size = 10000000;
  static final int h = size / 2;

  public static void main(String[] args) throws InterruptedException {
    var test = new TestArrays();
    test.createArray();
    test.createArrayInThreads();
  }

  public void createArray() {
    var arr = new float[size];
    Arrays.fill(arr, 1);
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
    System.out.printf("One thread time: %d\n", System.currentTimeMillis() - startTime);
  }

  public void createArrayInThreads() throws InterruptedException {
    var arr = new float[size];
    Arrays.fill(arr, 1);

    long startTime = System.currentTimeMillis();
    var arrOne = new float[h];
    var arrTwo = new float[h];
    System.arraycopy(arr, 0, arrOne, 0, h);
    System.arraycopy(arr, h, arrTwo, 0, h);

    Thread threadOne = new Thread(() -> {
      for (int i = 0; i < arrOne.length; i++) {
        arrOne[i] = (float) (arrOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
      }
      System.arraycopy(arrOne, 0, arr, 0, h);
    });
    Thread threadTwo = new Thread(() -> {
      for (int i = 0; i < arrTwo.length; i++) {
        arrTwo[i] = (float) (arrTwo[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
      }
      System.arraycopy(arrTwo, 0, arr, h, h);
    });

    threadOne.start();
    threadTwo.start();
    threadOne.join();
    threadTwo.join();
    System.out.printf("Two thread time: %d ms.\n", System.currentTimeMillis() - startTime);
  }
}
