import org.junit.Assert;
import org.junit.Test;

public class PyramidTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }


    @Test
    public void test5() throws Exception {
        String[] expected = {
                "    *    ",
                "   ***   ",
                "  *****  ",
                " ******* ",
                "*********",
        };
        Assert.assertArrayEquals(expected, Pyramid.draw(5));
    }
}
