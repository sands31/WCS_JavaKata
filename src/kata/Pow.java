public class Pow {

    public static double pow(int n, int e) {
        if (e < 0) {
            return 1 / pow(n, -e);
        }
        return e == 0 ? 1 : n * pow(n, e - 1);
    }
}
