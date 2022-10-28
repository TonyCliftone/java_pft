package homework.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistancePointTests {

  @Test
  public void testDistance() {
    PointValue fd = new PointValue(1, 2, 3, 4);
    Assert.assertEquals(fd.distance(), 2.8284271247461903);
  }

  @Test
  public void testDistanceTwo() {
    PointValue sd = new PointValue(2, 2, 2, 2);
    Assert.assertEquals(sd.distance(), 0.0);
  }

  @Test
  public void testDistanceThree() {
    PointValue sd = new PointValue(2, 2, 2, 3);
    Assert.assertEquals(sd.distance(), 6.0); // данный тест должен упасть, потому что ждем ответ 1.0
  }
}
