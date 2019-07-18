import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    public static String translate(String morse) {
        Map<String, String> morseMap = getMorseMap();

        String result = "";
        String[] words = morse.split("   ");
        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split(" ");
            for (int j = 0; j < letters.length; j++) {
                result += morseMap.get(letters[j]);
            }
            if (i + 1 < words.length) {
                result += " ";
            }
        }
        return result;
    }

    public static Map<String, String> getMorseMap() {
        Map<String, String> morseMap = new HashMap<>();
        morseMap.put("-.-.--", "!");
        morseMap.put("....-", "4");
        morseMap.put("..--..", "?");
        morseMap.put("--..--", ");");
        morseMap.put(".-.-.-", ".");
        morseMap.put("..---", "2");
        morseMap.put("...--", "3");
        morseMap.put("--...", "7");
        morseMap.put("-....", "6");
        morseMap.put(".....", "5");
        morseMap.put("---..", "8");
        morseMap.put("-...", "B");
        morseMap.put("----.", "9");
        morseMap.put(".--.", "P");
        morseMap.put("-----", "0");
        morseMap.put("--..", "Z");
        morseMap.put("-.--", "Y");
        morseMap.put("-..-", "X");
        morseMap.put("-.-.", "C");
        morseMap.put("...-", "V");
        morseMap.put(".----", "1");
        morseMap.put("..-.", "F");
        morseMap.put("....", "H");
        morseMap.put(".---", "J");
        morseMap.put("--.-", "Q");
        morseMap.put("-..-.", "/");
        morseMap.put(".-..", "L");
        morseMap.put("...", "S");
        morseMap.put("---", "O");
        morseMap.put("-.-", "K");
        morseMap.put(".-.", "R");
        morseMap.put("..-", "U");
        morseMap.put("-..", "D");
        morseMap.put(".--", "W");
        morseMap.put("--.", "G");
        morseMap.put("-.", "N");
        morseMap.put("--", "M");
        morseMap.put("..", "I");
        morseMap.put(".-", "A");
        morseMap.put("-", "T");
        morseMap.put(".", "E");
        return morseMap;
    }
}
