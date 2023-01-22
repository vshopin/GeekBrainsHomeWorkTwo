package lesson_one;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Human implements Contributor {

  private String name;
  private int maxJump;
  private int maxRunLength;

  @Override
  public int jump() {
    System.out.printf("Человек %s делает прыжок\n", name);
    return maxJump;
  }

  @Override
  public int run() {
    System.out.printf("Человек %s бежит дистанцию\n", name);
    return maxRunLength;
  }

  @Override
  public String toString() {
    return "Human{" +
      "name='" + name + '\'' +
      ", maxJump=" + maxJump +
      ", maxRunLength=" + maxRunLength +
      '}';
  }
}
