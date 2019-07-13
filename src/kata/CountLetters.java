public class CountLetters {

    public static int count(String str, char c) {
        if (str == null) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
