import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testRectangleArea() throws Exception {

        double width = 4.;
        double height = 2.;
        Rectangle rectangle = new Rectangle(width, height);
        Assert.assertEquals(8., rectangle.area(), 0);
    }

    @Test
    public void testTriangleArea() throws Exception {
        double base = 4.;
        double height = 4.;
        Triangle triangle = new Triangle(base, height);
        Assert.assertEquals(8., triangle.area(), 0);
    }

    @Test
    public void testCircleArea() throws Exception {
        double radius = 1.954410048;
        Circle circle = new Circle(radius);
        Assert.assertEquals(12, Math.round(circle.area()));
    }

    @Test
    public void testSquareArea() throws Exception {
        double side = 4.;
        Square square = new Square(side);
        Assert.assertEquals(16., square.area(), 0);
    }
}
