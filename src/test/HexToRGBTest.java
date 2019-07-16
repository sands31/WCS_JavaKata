import org.junit.Assert;
import org.junit.Test;

public class HexToRGBTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testConvert() throws Exception {
        Assert.assertArrayEquals(new int[]{0, 0, 0}, HexToRGB.converts("#000000"));
        Assert.assertArrayEquals(new int[]{255, 215, 0}, HexToRGB.converts("#FFD700"));
        Assert.assertArrayEquals(new int[]{154, 205, 50}, HexToRGB.converts("#9ACD32"));
    }
}
