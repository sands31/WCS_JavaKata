public class HexToDecimal {

    public static int convert(String hex) {
        if (hex == null || hex.isEmpty()) {
            throw new IllegalArgumentException();
        }
        String hexValues = "0123456789ABCDEF";
        int result = 0;
        for (int i = hex.length() - 1, j = 0; i >= 0; i--, j++) {
            int value = hexValues.indexOf("" + hex.charAt(i));
            if (value < 0) {
                throw new IllegalArgumentException();
            }
            result += value * Math.pow(16, j);
        }
        return result;
    }
}
