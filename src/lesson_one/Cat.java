package lesson_one;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cat implements Contributor {

  private String name;
  private int maxJump;
  private int maxRunLength;

  @Override
  public int jump() {
    System.out.printf("Кот %s делает прыжок\n", name);
    return maxJump;
  }

  @Override
  public int run() {
    System.out.printf("Кот %s бежит дистанцию\n", name);
    return maxRunLength;
  }

  @Override
  public String toString() {
    return "Cat{" +
      "name='" + name + '\'' +
      ", maxJump=" + maxJump +
      ", maxRunLength=" + maxRunLength +
      '}';
  }
}
