package homework.first;

public class PointValue {
  public double x; // переменная х точки
  public double y; // переменная y точки

  public PointValue(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(PointValue p2) {
    return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
  }
}
