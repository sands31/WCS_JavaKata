import java.util.HashMap;

public class RomanToArabic {

    public static int convert(String roman) {
        if (roman == null || roman.isBlank()) {
            throw new IllegalArgumentException("Illegal roman numeral");
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for(int i = 0; i < roman.length(); i++) {
            if (!map.containsKey(roman.charAt(i))) {
                throw new IllegalArgumentException("Illegal roman numeral");
            }
            int current = map.get(roman.charAt(i));
            if (i + 1 < roman.length()) {
                if (!map.containsKey(roman.charAt(i + 1))) {
                    throw new IllegalArgumentException("Illegal roman numeral");
                }
                int next = map.get(roman.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        return result;
    }
}
