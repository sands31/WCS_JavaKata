public class TicTacToe {

    public static char analyse(char[][] grid) {
        if (grid == null || grid.length != 3) {
            throw new IllegalArgumentException("Illegal grid !");
        }
        char player = ' ';
        // check if grid is valid
        int totalX = 0;
        int totalO = 0;
        for (int i = 0; i < 3; i++) {
            if (grid[i].length != 3) {
                throw new IllegalArgumentException("Illegal grid !");
            }
            for (int j = 0; j < 3; j++) {
                player = grid[i][j];
                if (!"XO ".contains("" + player)) {
                    throw new IllegalArgumentException("Illegal grid !");
                }
                if (player == 'X') {
                    totalX++;
                }
                if (player == 'O') {
                    totalO++;
                }
            }
        }
        if (Math.abs(totalO - totalX) > 1) {
            throw new IllegalStateException("One player cheated !");
        }

        char result = 'C';

        // check horizontal and vertical
        for (int i = 0; i < 3; i++) {
            player = grid[i][0];
            int countH = 1;
            int countV = 1;
            for (int j = 1; j < 3 && player != ' '; j++) {
                if (player == grid[i][j]) {
                    countH++;
                }
                if (player == grid[j][i]) {
                    countV++;
                }
            }
            if (countH == 3 || countV == 3) {
                return player;
            }
        }
        // check diagonal top left
        player = grid[0][0];
        if (player != ' ' && player == grid[1][1] && player == grid[2][2]) {
            return player;
        }

        // check diagonal top right
        player = grid[0][2];
        if (player != ' ' && player == grid[1][1] && player == grid[2][0]) {
            return player;
        }

        return result;
    }
}