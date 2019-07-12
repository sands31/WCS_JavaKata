import org.junit.Assert;
import org.junit.Test;

public class HelloYouTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertEquals("Hello World", HelloYou.sayHello(null));
    }

    @Test
    public void testEmpty() throws Exception {
        Assert.assertEquals("Hello World", HelloYou.sayHello(""));
    }

    @Test
    public void testBarbara() throws Exception {
        Assert.assertEquals("Hello Barbara", HelloYou.sayHello("Barbara"));
    }
}
