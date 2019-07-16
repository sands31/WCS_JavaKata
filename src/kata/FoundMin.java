public class FoundMin {

    public static int search(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            int value = values[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
