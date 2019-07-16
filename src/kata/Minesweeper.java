public class Minesweeper {

    public static String sweep(int[][] grid, int row, int column) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            throw new IllegalArgumentException();
        }
        if (row < 0 || row >= grid.length
                || column < 0 || column >= grid[row].length) {
            throw new IndexOutOfBoundsException();
        }
        if (grid[row][column] == 1) {
            return "kaboom";
        }
        int minRow = Math.max(row - 1, 0);
        int maxRow = Math.min(row + 1, grid.length - 1);
        int minColumn = Math.max(column - 1, 0);
        int maxColumn = Math.min(column + 1, grid[row].length - 1);

        int bombs = 0;
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minColumn; j <= maxColumn; j++) {
                if (grid[i][j] == 1) {
                    bombs++;
                }
            }
        }
        return "" + bombs;
    }
}
