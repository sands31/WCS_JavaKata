import org.junit.Assert;
import org.junit.Test;

public class MorseCodeTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testWord() throws Exception {
        Assert.assertEquals("WILD", MorseCode.translate(".-- .. .-.. -.."));
    }

    @Test
    public void testSentence() throws Exception {
        Assert.assertEquals("WILD CODE", MorseCode.translate(".-- .. .-.. -..   -.-. --- -.. ."));
    }

}
