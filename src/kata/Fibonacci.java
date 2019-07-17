public class Fibonacci {

    public static int fibo(int n) {
        if (n <= 1) {
            return n; // fibo(0) == 0 and fibo(1) == 1
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
