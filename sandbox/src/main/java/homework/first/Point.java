package homework.first;

import ru.stqa.pft.sandbox.Square;

public class Point {

  public static void main(String[] args) {
     PointValue p = new PointValue(3, 5);
     PointValue p2 = new PointValue(3, 8);
    System.out.println("Расстояние между точками = " + p.distance(p2));
  }


}
