import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testEncrypt() throws Exception {
        Assert.assertEquals("bcde", CaesarCipher.encrypt("abcd", 1));
        Assert.assertEquals("zabc", CaesarCipher.encrypt("abcd", -1));
        Assert.assertEquals("wdfrv", CaesarCipher.encrypt("tacos", 3));
        Assert.assertEquals("bgdtc", CaesarCipher.encrypt("zebra", 2));
    }
}
