import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testPalindrome() throws Exception {
        Assert.assertEquals(true, Palindrome.isPalindrome(null));
        Assert.assertEquals(true, Palindrome.isPalindrome(""));
        Assert.assertEquals(true, Palindrome.isPalindrome("rotor"));
        Assert.assertEquals(false, Palindrome.isPalindrome("tacos"));
        Assert.assertEquals(true, Palindrome.isPalindrome("Kayak"));
    }
}
