package lesson_three;

import java.util.HashMap;

public class PhoneDirectory {
  private HashMap<String, String> phoneDirectory = new HashMap<>();

  public HashMap<String, String> getPhoneDirectory() {
    return phoneDirectory;
  }
  private void get(String lastName) {
    for (String key : phoneDirectory.keySet()) {
      if (phoneDirectory.get(key).equals(lastName)) {
        System.out.println(phoneDirectory.get(key) + " - " + key);
      }
    }
  }
  public static void main(String[] args) {
    var directory = new PhoneDirectory();
    directory.phoneDirectory.put("89137775530", "Ivanov");
    directory.phoneDirectory.put("89137775531", "Petrov");
    directory.phoneDirectory.put("89137775532", "Sidorov");
    directory.phoneDirectory.put("89137775533", "Govnov");
    directory.phoneDirectory.put("89137775534", "Pidorov");
    directory.phoneDirectory.put("89137775535", "Huidorov");
    directory.phoneDirectory.put("89137775536", "Ivanov");
    directory.phoneDirectory.put("89137775537", "Petrov");
    directory.get("Ivanov");
    directory.get("Petrov");
    directory.get("Govnov");
  }

}
