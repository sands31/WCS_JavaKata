import org.junit.Assert;
import org.junit.Test;

public class ChmodTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testConversion() throws Exception {
        Assert.assertEquals("---------", Chmod.convert("000"));
        Assert.assertEquals("-wxr-x-w-", Chmod.convert("352"));
        Assert.assertEquals("rwxrwxrwx", Chmod.convert("777"));
    }
}
