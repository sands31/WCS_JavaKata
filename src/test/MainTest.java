import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertArrayEquals(new int[] {1, 13, 25, 48}, Main.sortedArray(new int[] {1, 25, 13, 48}));
    }

}
