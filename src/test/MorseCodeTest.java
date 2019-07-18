import org.junit.Assert;
import org.junit.Test;

public class MorseCodeTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void test1() throws Exception {
        Assert.assertEquals("WILD", MorseCode.translate(".-- .. .-.. -.."));
    }

    @Test
    public void test2() throws Exception {
        Assert.assertEquals("WILD CODE", MorseCode.translate(".-- .. .-.. -..   -.-. --- -.. ."));
    }

}
