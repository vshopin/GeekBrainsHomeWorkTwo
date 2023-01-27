package lesson_two;

public class MyArraySizeException extends Exception {
  public MyArraySizeException(int length) {
    System.out.printf("Превышена длина массива, допускается массив длинной 4. Текущаяя длинна массива %d",length);
  }
}
