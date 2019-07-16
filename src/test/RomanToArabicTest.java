import org.junit.Assert;
import org.junit.Test;

public class RomanToArabicTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty() throws Exception {
        RomanToArabic.convert("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws Exception {
        RomanToArabic.convert(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegal() throws Exception {
        RomanToArabic.convert("XS");
    }

    @Test
    public void testOther() throws Exception {
        Assert.assertEquals(1, RomanToArabic.convert("I"));
        Assert.assertEquals(3, RomanToArabic.convert("III"));
        Assert.assertEquals(4, RomanToArabic.convert("IV"));
        Assert.assertEquals(5, RomanToArabic.convert("V"));
        Assert.assertEquals(8, RomanToArabic.convert("VIII"));
        Assert.assertEquals(9, RomanToArabic.convert("IX"));
        Assert.assertEquals(10, RomanToArabic.convert("X"));
        Assert.assertEquals(89, RomanToArabic.convert("IXC"));
        Assert.assertEquals(111, RomanToArabic.convert("CXI"));
        Assert.assertEquals(666, RomanToArabic.convert("DCLXVI"));
        Assert.assertEquals(1000, RomanToArabic.convert("M"));
    }
}
