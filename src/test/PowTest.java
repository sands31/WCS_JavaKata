import org.junit.Assert;
import org.junit.Test;

public class PowTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testPow() throws Exception {
        Assert.assertEquals(1, Pow.pow(2, 0), 0);
        Assert.assertEquals(2, Pow.pow(2, 1), 0);
        Assert.assertEquals(4, Pow.pow(2, 2), 0);
        Assert.assertEquals(8, Pow.pow(2, 3), 0);
        Assert.assertEquals(16, Pow.pow(2, 4), 0);
        Assert.assertEquals(32, Pow.pow(2, 5), 0);
        Assert.assertEquals(0.25, Pow.pow(2, -2), 0);
    }
}
