public class SortArray {

    public static int[] sort(int[] values) {

        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            for (int j = i; j < values.length; j++) {
                if (values[j] < value) {
                    value = values[j];
                    values[j] = values[i];
                    values[i] = value;
                }
            }
        }
        return values;
    }
}
