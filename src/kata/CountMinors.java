public class CountMinors {

    public static int count(int[] ages, int legalAge) {
        if (ages == null || legalAge < 0) {
            return -1;
        }
        int count = 0;
        for (int age : ages) {
            if (age < legalAge) {
                count++;
            }
        }
        return count;
    }
}
