public class Palindrome {

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return true;
        }
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
