package lesson_two;

public class MyArrayDataException extends Exception {
  public MyArrayDataException(int posI, int posJ) {
    System.out.printf("Неверный формат переменной в элементе массива с индексом [%d][%d]", posI, posJ);
  }
}
