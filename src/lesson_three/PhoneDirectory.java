package lesson_three;

import java.util.HashMap;

public class PhoneDirectory {
  private HashMap<String, String> phoneDirectory = new HashMap<>();

  private void get(String lastName) {
    for (String key : phoneDirectory.keySet()) {
      if (phoneDirectory.get(key).equals(lastName)) {
        System.out.println(phoneDirectory.get(key) + " - " + key);
      }
    }
  }

  public static void main(String[] args) {
    PhoneDirectory phoneDirectory = new PhoneDirectory();
    phoneDirectory.phoneDirectory.put("Ivanov", "89137775530");
    phoneDirectory.phoneDirectory.put("Petrov", "89137775531");
    phoneDirectory.phoneDirectory.put("Sidorov", "89137775532");
    phoneDirectory.phoneDirectory.put("Govnov", "89137775533");
    phoneDirectory.phoneDirectory.put("Pidorov", "89137775534");
    phoneDirectory.phoneDirectory.put("Huidorov", "89137775535");
    phoneDirectory.phoneDirectory.put("Ivanov", "89137775536");
    phoneDirectory.phoneDirectory.put("Petrov", "89137775537");
    phoneDirectory.phoneDirectory.get("Ivanov");
    phoneDirectory.phoneDirectory.get("Petrov");
    phoneDirectory.phoneDirectory.get("Govnov");
  }

}
