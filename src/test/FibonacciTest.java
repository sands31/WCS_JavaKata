import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testFibo() throws Exception {
        Assert.assertEquals(0, Fibonacci.fibo(0));
        Assert.assertEquals(1, Fibonacci.fibo(1));
        Assert.assertEquals(3, Fibonacci.fibo(4));
        Assert.assertEquals(8, Fibonacci.fibo(6));
        Assert.assertEquals(21, Fibonacci.fibo(8));
    }
}
