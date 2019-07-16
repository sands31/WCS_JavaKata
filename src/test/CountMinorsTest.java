import org.junit.Assert;
import org.junit.Test;

public class CountMinorsTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertEquals(-1, CountMinors.count(null, 0));
    }

    @Test
    public void testNegative() throws Exception {
        Assert.assertEquals(-1, CountMinors.count(new int[]{18}, -1));
    }

    @Test
    public void testCount() throws Exception {
        Assert.assertEquals(4, CountMinors.count(new int[]{12, 16, 23, 47, 5, 16, 18}, 18));
        Assert.assertEquals(5, CountMinors.count(new int[]{12, 16, 23, 47, 5, 16, 18}, 21));
    }
}
