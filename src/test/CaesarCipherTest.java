import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals("bcde", CaesarCipher.ceasarCipher("abcd", 1));
    }
    
    @Test
    public void testTrue1() throws Exception {
        Assert.assertEquals("zabc", CaesarCipher.ceasarCipher("abcd", -1));
    }
    
    @Test
    public void testTrue2() throws Exception {
        Assert.assertEquals("wdfrv", CaesarCipher.ceasarCipher("tacos", 3));
    }
    
    @Test
    public void testTrue3() throws Exception {
        Assert.assertEquals("bgdtc", CaesarCipher.ceasarCipher("zebra", 2));
    }
}
