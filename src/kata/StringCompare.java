public class StringCompare {

    public static int compare(String origin, String compare) {
        if (origin == null || compare == null
                || origin.length() != compare.length()) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < origin.length(); i++) {
            if (origin.charAt(i) == compare.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
