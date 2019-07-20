public class DecimalToBinary {

    public static String convert(int decimal) {
        String result = "";
        do {
            result = "" + decimal % 2 + result;
            decimal = decimal / 2;
        } while (decimal > 0);
        return result;
    }
}
