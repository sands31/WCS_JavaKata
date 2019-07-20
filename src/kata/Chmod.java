public class Chmod {

    public static String convert(String numerical) {
        String result = "";
        for (char digit : numerical.toCharArray()) {
            int decimal = Integer.parseInt("" + digit);
            String binary = decimalToBinary(decimal);
            // padding left with zeros
            while (binary.length() < 3) {
                binary = "0" + binary;
            }
            result += binaryToOctal(binary);
        }
        return result;
    }

    public static String binaryToOctal(String binary) {
        String octal = "";
        octal += binary.charAt(0) == '1' ? 'r' : '-';
        octal += binary.charAt(1) == '1' ? 'w' : '-';
        octal += binary.charAt(2) == '1' ? 'x' : '-';
        return octal;
    }

    public static String decimalToBinary(int decimal) {
        String result = "";
        do {
            result = "" + decimal % 2 + result;
            decimal = decimal / 2;
        } while (decimal > 0);
        return result;
    }
}
