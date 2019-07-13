import org.junit.Assert;
import org.junit.Test;

public class CountLettersTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertEquals(-1, CountLetters.count(null, 'a'));
    }

    @Test
    public void testOther() throws Exception {
        Assert.assertEquals(1, CountLetters.count("a", 'a'));
        Assert.assertEquals(7, CountLetters.count("aaaaabbbaa", 'a'));
        Assert.assertEquals(1, CountLetters.count("bbacbaaa", 'c'));
        Assert.assertEquals(0, CountLetters.count("bbcc", 'a'));
    }
}
