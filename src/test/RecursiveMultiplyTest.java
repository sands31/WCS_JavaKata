import org.junit.Assert;
import org.junit.Test;

public class RecursiveMultiplyTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testZero() throws Exception {
        Assert.assertEquals(0, RecursiveMultiply.multiply(3, 0));
        Assert.assertEquals(0, RecursiveMultiply.multiply(0, 5));
        Assert.assertEquals(0, RecursiveMultiply.multiply(0, 0));
    }

    @Test
    public void testPositive() throws Exception {
        Assert.assertEquals(18, RecursiveMultiply.multiply(3, 6));
        Assert.assertEquals(12, RecursiveMultiply.multiply(6, 2));
        Assert.assertEquals(1000000, RecursiveMultiply.multiply(100000, 10));
        Assert.assertEquals(1048576, RecursiveMultiply.multiply(1024, 1024));
    }

    @Test
    public void testNegative() throws Exception {
        Assert.assertEquals(-18, RecursiveMultiply.multiply(3, -6));
        Assert.assertEquals(-12, RecursiveMultiply.multiply(-6, 2));
        Assert.assertEquals(24, RecursiveMultiply.multiply(-6, -4));
    }
}
