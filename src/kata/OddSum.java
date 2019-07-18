public class OddSum {

    public static int sum(int[] values) {
        int result = 0;
        for (int value : values) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }
}
