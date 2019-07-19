public class Factorial {

    public static long facto(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return facto(n - 1) * n;
    }
}
