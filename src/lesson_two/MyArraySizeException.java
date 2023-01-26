package lesson_two;

public class MyArraySizeException extends Exception {
  public MyArraySizeException() {
    System.out.println("Превышена длина массива");
  }
}
