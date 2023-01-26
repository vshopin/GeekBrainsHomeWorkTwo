package lesson_two;

public class MyExeption {
  public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
    String[][] testArray = {{"1", "2", "3", "4"},
      {"5", "6", "7", "8"},
      {"9", "10", "11", "12"},
      {"13", "14", "15", "16"}};
    System.out.println(arrayExeptions(testArray));
  }

  public static int arrayExeptions(String[][] array) throws MyArraySizeException, MyArrayDataException {
    int[][] resultArray = new int[4][4];
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      if (array.length != 4) {
        throw new MyArraySizeException();
      }
      for (int j = 0; j < array[i].length; j++) {
        if (array[i].length != 4) {
          throw new MyArraySizeException();
        }
        try {
          resultArray[i][j] = Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException(i, j);
        }
        sum += resultArray[i][j];
      }
    }
    return sum;
  }
}
