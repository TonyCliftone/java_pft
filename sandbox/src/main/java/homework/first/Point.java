package homework.first;

import ru.stqa.pft.sandbox.Square;

public class Point {
  public static void main(String[] args) {
     PointValue p = new PointValue(5, 10, 15, 20);
    System.out.println("Расстояние между точками = " + p.distance());
  }


}
