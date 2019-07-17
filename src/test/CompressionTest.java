import org.junit.Assert;
import org.junit.Test;

public class CompressionTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testEncode() throws Exception {
        Assert.assertEquals("", Compression.encode(null));
        Assert.assertEquals("", Compression.encode(""));
        Assert.assertEquals("a", Compression.encode("a"));
        Assert.assertEquals("aa", Compression.encode("aa"));
        Assert.assertEquals("a3", Compression.encode("aaa"));
        Assert.assertEquals("a4bbc3a", Compression.encode("aaaabbccca"));
        Assert.assertEquals("tacos", Compression.encode("tacos"));
        Assert.assertEquals("abbc3a3", Compression.encode("abbcccaaa"));
    }
}
