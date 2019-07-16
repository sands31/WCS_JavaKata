import org.junit.Assert;
import org.junit.Test;

public class FoundMinTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testFound() throws Exception {
        Assert.assertEquals(0, FoundMin.search(new int[]{0, 1, 2, 3}));
        Assert.assertEquals(-3, FoundMin.search(new int[]{8, -3, 16, 2}));
        Assert.assertEquals(-6, FoundMin.search(new int[]{-6}));
    }
}
