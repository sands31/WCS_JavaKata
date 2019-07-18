import org.junit.Assert;
import org.junit.Test;

public class OddSumTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(0, OddSum.sum(new int[]{}));
        Assert.assertEquals(0, OddSum.sum(new int[]{2}));
        Assert.assertEquals(9, OddSum.sum(new int[]{1, 2, 3, 4, 5}));
    }
}
