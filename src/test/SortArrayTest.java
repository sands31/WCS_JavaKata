import org.junit.Assert;
import org.junit.Test;

public class SortArrayTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testSort() throws Exception {
        Assert.assertArrayEquals(new int[]{}, SortArray.sort(new int[]{}));
        Assert.assertArrayEquals(new int[]{1, 1}, SortArray.sort(new int[]{1, 1}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SortArray.sort(new int[]{5, 2, 3, 1, 4}));
        Assert.assertArrayEquals(new int[]{-16, -4, 3, 6, 7}, SortArray.sort(new int[]{-16, 6, 3, -4, 7}));
        Assert.assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, SortArray.sort(new int[]{0, Integer.MAX_VALUE, Integer.MIN_VALUE}));
    }
}
