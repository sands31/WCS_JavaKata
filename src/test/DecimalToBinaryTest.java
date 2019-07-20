import org.junit.Assert;
import org.junit.Test;

public class DecimalToBinaryTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testConversion() throws Exception {
        Assert.assertEquals("0", DecimalToBinary.convert(0));
        Assert.assertEquals("1", DecimalToBinary.convert(1));
        Assert.assertEquals("10", DecimalToBinary.convert(2));
        Assert.assertEquals("10100100", DecimalToBinary.convert(164));
    }
}
