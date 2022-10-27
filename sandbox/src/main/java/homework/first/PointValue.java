package homework.first;

public class PointValue {
  public double p1; // первая точка по графе x
  public double p2; // первая точка по графе y
  public double p3; // вторая точка по графе x
  public double p4; // вторая точка по графе y
  public PointValue (double p1, double p2, double p3, double p4) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.p4 = p4;
  }
  public double distance() {
    return Math.sqrt((p3 - p1)*(p3 - p1) + (p4 - p2)*(p4-p2));
  }
}
