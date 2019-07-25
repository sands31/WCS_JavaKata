import org.junit.Assert;
import org.junit.Test;

public class HexToDecimalTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws Exception {
        HexToDecimal.convert(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty() throws Exception {
        HexToDecimal.convert("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegal() throws Exception {
        HexToDecimal.convert("4UA0");
    }

    @Test
    public void testConvert() throws Exception {
        Assert.assertEquals(0, HexToDecimal.convert("0"));
        Assert.assertEquals(1, HexToDecimal.convert("1"));
        Assert.assertEquals(10, HexToDecimal.convert("A"));
        Assert.assertEquals(16, HexToDecimal.convert("10"));
        Assert.assertEquals(255, HexToDecimal.convert("FF"));
        Assert.assertEquals(20268, HexToDecimal.convert("4F2C"));
    }
}
