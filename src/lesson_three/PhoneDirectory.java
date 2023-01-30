package lesson_three;

import lombok.Getter;

import java.util.HashMap;

public class PhoneDirectory {
  @Getter
  private HashMap<String, String> phoneDirectory = new HashMap<>();

  private void get(String lastName) {
    for (String key : phoneDirectory.keySet()) {
      if (phoneDirectory.get(key).equals(lastName)) {
        System.out.println(phoneDirectory.get(key) + " - " + key);
      }
    }
  }


  public static void main(String[] args) {
    var directory = new PhoneDirectory();
    directory.getPhoneDirectory().put("89137775529", "Ivanov");
    directory.getPhoneDirectory().put("89137775530", "Ivanov");
    directory.getPhoneDirectory().put("89137775531", "Petrov");
    directory.getPhoneDirectory().put("89137775532", "Sidorov");
    directory.getPhoneDirectory().put("89137775533", "Govnov");
    directory.getPhoneDirectory().put("89137775534", "Pidorov");
    directory.getPhoneDirectory().put("89137775535", "Huidorov");
    directory.getPhoneDirectory().put("89137775536", "Ivanov");
    directory.getPhoneDirectory().put("89137775537", "Petrov");
    directory.get("Ivanov");
    directory.get("Petrov");
    directory.get("Govnov");
  }

}
