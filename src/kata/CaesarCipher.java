public class CaesarCipher {

    public static String encrypt(String word, int shift) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for (char letter : word.toCharArray()) {
            int pos = alphabet.indexOf(letter) + shift;
            if (pos < 0) {
                pos = alphabet.length() + pos;
            }
            if (pos >= alphabet.length()) {
                pos = pos - alphabet.length();
            }
            result += alphabet.charAt(pos);
        }

        return result;
    }
}
