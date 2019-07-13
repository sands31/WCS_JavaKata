public class Pyramid {

    public static String[] draw(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(i + i - 1);
            result[i - 1] = spaces + stars + spaces;
        }
        return result;
    }
}
