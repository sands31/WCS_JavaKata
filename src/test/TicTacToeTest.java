import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testColumn() throws Exception {
        char[][] grid = {
                {'X', 'O', 'O'},
                {'X', 'O', 'O'},
                {'X', ' ', ' '},
        };
        Assert.assertEquals('X', TicTacToe.analyse(grid));
    }

    @Test
    public void testLine() throws Exception {
        char[][] grid = {
                {'X', 'O', 'X'},
                {'O', 'O', 'O'},
                {' ', ' ', 'X'},
        };
        Assert.assertEquals('O', TicTacToe.analyse(grid));
    }

    @Test
    public void testDiagonalTopLeft() throws Exception {
        char[][] grid = {
                {'X', 'X', 'O'},
                {'O', 'X', 'O'},
                {'X', 'O', 'X'},
        };
        Assert.assertEquals('X', TicTacToe.analyse(grid));
    }

    @Test
    public void testDiagonalTopRight() throws Exception {
        char[][] grid = {
                {'O', 'X', 'X'},
                {'O', 'X', 'O'},
                {'X', 'O', 'X'},
        };
        Assert.assertEquals('X', TicTacToe.analyse(grid));
    }

    @Test
    public void testDraw() throws Exception {
        char[][] grid = {
                {'O', 'X', 'O'},
                {'X', 'X', 'O'},
                {'O', 'O', 'X'},
        };
        Assert.assertEquals('C', TicTacToe.analyse(grid));
    }

    @Test
    public void testNobodyWins() throws Exception {
        char[][] grid = {
                {'O', 'X', ' '},
                {' ', ' ', ' '},
                {' ', 'O', ' '},
        };
        Assert.assertEquals('C', TicTacToe.analyse(grid));
    }

    @Test(expected = IllegalStateException.class)
    public void testCheats() throws Exception {
        char[][] grid = {
                {'O', 'X', 'X'},
                {'X', 'X', 'O'},
                {'X', 'O', 'X'},
        };
        TicTacToe.analyse(grid);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws Exception {
        TicTacToe.analyse(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidGrid() throws Exception {
        char[][] grid = {
                {'X', 'X', 'O'},
                {'X', 'X'},
                {'X', 'O', 'X'},
        };
        TicTacToe.analyse(grid);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCharacter() throws Exception {
        char[][] grid = {
                {'O', 'X', 'O'},
                {'X', 'X', '0'},
                {'X', 'O', 'O'},
        };
        TicTacToe.analyse(grid);
    }
}
