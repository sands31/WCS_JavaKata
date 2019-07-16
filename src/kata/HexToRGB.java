public class HexToRGB {

    public static int[] converts(String webColor) {
        String red = webColor.substring(1, 3);
        String blue = webColor.substring(3, 5);
        String green = webColor.substring(5, 7);

        return new int[]{
                Integer.parseInt(red, 16),
                Integer.parseInt(blue, 16),
                Integer.parseInt(green, 16)
        };
    }
}
