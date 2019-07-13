public class BinaryToDecimal {

    public static int convert(String binary) {
        if (binary == null || binary.isEmpty()) {
            throw new IllegalArgumentException("Illegal binary string");
        }
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(2, binary.length() - 1 - i);
            } else if (binary.charAt(i) != '0') {
                throw new IllegalArgumentException("Illegal binary string");
            }
        }
        return result;
    }
}
