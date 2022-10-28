package homework.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistancePointTests {

  @Test
  public void testDistance() {
    PointValue fd = new PointValue(3, 5);
    PointValue fd2 = new PointValue(3, 8);
    Assert.assertEquals(fd.distance(fd2), 3.0);
  }

  @Test
  public void testDistanceTwo() {
    PointValue sd = new PointValue(2, 2);
    PointValue sd2 = new PointValue(2, 2);
    Assert.assertEquals(sd.distance(sd2), 0.0);
  }

  @Test
  public void testDistanceThree() {
    PointValue td = new PointValue(2, 2);
    PointValue td2 = new PointValue(2, 2);
    Assert.assertEquals(td.distance(td2), 1.0); // данный тест должен упасть, потому что ждем ответ 1.0
  }
}
