import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testN() throws Exception {
        Assert.assertEquals("-1", FizzBuzz.fizzBuzz(-1));
    }

    @Test
    public void test6() throws Exception {
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void test10() throws Exception {
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void test30() throws Exception {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
}
