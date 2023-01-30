package lesson_three;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicates {
  public static void main(String[] args) {
    String[] array = {"A", "B", "C", "D", "E", "E", "A", "A", "D", "A"};
    var list = new ArrayList<String>();
    var myMap = new HashMap<String, Integer>();
    for (String item : array) {
      int cnt = 0;
      for (int j = 1; j < array.length; j++) {
        if (array[j].equals(item)) {
          cnt += 1;
        }
      }
      myMap.put(item, cnt);
    }
    for (Integer value : myMap.values()) {
      if (value == 1) {
        System.out.println();
      }
    }
    System.out.println("Подсчет количества элементов:");
    for (String key : myMap.keySet()) {
      if (myMap.get(key) == 1) {
        list.add(key);
      }
      System.out.println(key + " - " + myMap.get(key));
    }
    System.out.printf("\nУникальные элементы массива без учета дубликатов:\n%s", list);
  }
}
