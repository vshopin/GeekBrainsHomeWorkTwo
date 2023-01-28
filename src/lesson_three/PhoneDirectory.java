package lesson_three;

import java.util.HashMap;

public class PhoneDirectory {

  private static HashMap<String, String> phoneDirectory = new HashMap<>();

  private static void add(String lastName, String phone) {
    phoneDirectory.put(phone, lastName);
  }

  private static void get(String lastName) {
    for (String key : phoneDirectory.keySet()) {
      if (phoneDirectory.get(key).equals(lastName)) {
        System.out.println(phoneDirectory.get(key) + " - " + key);
      }
    }
  }

  public static void main(String[] args) {
    add("Ivanov", "89137775530");
    add("Petrov", "89137775531");
    add("Sidorov", "89137775532");
    add("Govnov", "89137775533");
    add("Pidorov", "89137775534");
    add("Huidorov", "89137775535");
    add("Ivanov", "89137775536");
    add("Petrov", "89137775537");
    get("Ivanov");
    get("Petrov");
    get("Govnov");
  }

}
