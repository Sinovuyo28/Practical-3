import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {

    @Before
    public void setUp() throws Exception {
        Circle circle = new Circle();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void circleArea() {

        Circle circle = new Circle();
        double areaResult = circle.circleArea(5);
        Assert.assertEquals(78,78.53981633974483,areaResult);
    }

    @Test
    public void circlePermimeter() {
        Circle circle = new Circle();
        double peri = circle.circlePerimeter(5);
        Assert.assertEquals(32,31.41592653589793,peri);

    }


}