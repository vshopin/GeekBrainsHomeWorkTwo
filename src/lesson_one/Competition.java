package lesson_one;

public class Competition {
  public static void main(String[] args) {
    Contributor human = new Human("Vova", 2, 500);
    Contributor cat = new Cat("Barsik", 3, 200);
    Contributor robot = new Robot("T1000", 10, 6000);

    Wall wall = new Wall(3);
    Racetrack racetrack = new Racetrack(1500);

    Contributor[] contributors = {human, cat, robot};
    for (Contributor contributor : contributors) {
      if (wall.doJump(contributor)) {
        racetrack.doRun(contributor);
      } else {
        System.out.printf("Участник %s снимается с дистанции\n", contributor);
      }
    }
  }
}
