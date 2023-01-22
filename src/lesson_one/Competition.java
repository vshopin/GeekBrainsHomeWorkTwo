package lesson_one;

public class Competition {
  public static void main(String[] args) {
    var human = new Human("Vova", 2, 500);
    var cat = new Cat("Barsik", 3, 200);
    var robot = new Robot("T1000", 10, 6000);

    var wall = new Wall(3);
    var racetrack = new Racetrack(1500);

    Contributor[] contributors = {human, cat, robot};
    for (var contributor : contributors) {
      if (wall.doJump(contributor)) {
        racetrack.doRun(contributor);
      } else {
        System.out.printf("Участник %s снимается с дистанции\n", contributor);
      }
    }
  }
}
