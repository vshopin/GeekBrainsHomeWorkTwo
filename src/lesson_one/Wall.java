package lesson_one;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Wall {
  private int height;

  public boolean doJump(Contributor contributor) {
    if (contributor.jump() > height) {
      System.out.printf("Участник %s перепрыгнул стену\n", contributor);
      return true;
    } else {
      System.out.printf("Участник %s не перепрыгнул стену\n", contributor);
      return false;
    }
  }
}
