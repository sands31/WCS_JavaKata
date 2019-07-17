public class Compression {

    public static String encode(String data) {
        if (data == null) {
            return "";
        }
        String result = "";
        int count = 1;

        for (int i = 0; i < data.length(); i++) {
            char current = data.charAt(i);
            if (i + 1 == data.length() || current != data.charAt(i + 1)) {
                result += current;
                if (count == 2) {
                    result += current;
                } else if (count > 2) {
                    result += count;
                }
                count = 1;
            } else {
                count++;
            }
        }

        return result;
    }
}
