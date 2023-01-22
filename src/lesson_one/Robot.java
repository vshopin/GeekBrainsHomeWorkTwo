package lesson_one;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Robot implements Contributor {

  private String name;
  private int maxJump;
  private int maxRunLength;

  @Override
  public int jump() {
    System.out.printf("Робот %s делает прыжок\n", name);
    return maxJump;
  }

  @Override
  public int run() {
    System.out.printf("Робот %s бежит дистанцию\n", name);
    return maxRunLength;
  }

  @Override
  public String toString() {
    return "Robot{" +
      "name='" + name + '\'' +
      ", maxJump=" + maxJump +
      ", maxRunLength=" + maxRunLength +
      '}';
  }
}
