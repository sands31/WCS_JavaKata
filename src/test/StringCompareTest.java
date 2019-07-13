import org.junit.Assert;
import org.junit.Test;

public class StringCompareTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertEquals(-1, StringCompare.compare(null, null));
    }

    @Test
    public void testLength() throws Exception {
        Assert.assertEquals(-1, StringCompare.compare("tacos", "poulpe"));
    }

    @Test
    public void testOther() throws Exception {
        Assert.assertEquals(1, StringCompare.compare("a", "a"));
        Assert.assertEquals(0, StringCompare.compare("a", "b"));
        Assert.assertEquals(1, StringCompare.compare("aa", "ba"));
        Assert.assertEquals(3, StringCompare.compare("cassis", "castor"));
    }
}
