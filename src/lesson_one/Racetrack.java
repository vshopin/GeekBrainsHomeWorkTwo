package lesson_one;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Racetrack {
  private int length;

  public boolean doRun(Contributor contributor) {
    if (contributor.run() > length) {
      System.out.printf("Участник %s пробежал дистанцию\n", contributor);
      return true;
    } else {
      System.out.printf("Участник %s не пробежал дистанцию\n", contributor);
      return false;
    }
  }
}
