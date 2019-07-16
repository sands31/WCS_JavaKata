import org.junit.Assert;
import org.junit.Test;

public class MinesweeperTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArgument() throws Exception {
        Minesweeper.sweep(null, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgument() throws Exception {
        int[][] grid = {{}};
        Minesweeper.sweep(grid, 0, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfBoundRow() throws Exception {
        int[][] grid = {
                {0, 0, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 0, 0}
        };
        Minesweeper.sweep(grid, 4, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfBoundColumn() throws Exception {
        int[][] grid = {
                {0, 0, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 0, 0}
        };
        Minesweeper.sweep(grid, 0, -1);
    }

    @Test
    public void testBoom() throws Exception {
        int[][] grid = {
                {0, 0, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 0, 0}
        };
        Assert.assertEquals("kaboom", Minesweeper.sweep(grid, 1, 1));
        Assert.assertEquals("kaboom", Minesweeper.sweep(grid, 0, 3));
        Assert.assertEquals("kaboom", Minesweeper.sweep(grid, 2, 0));
    }

    @Test
    public void testSweep() throws Exception {
        int[][] grid = {
                {0, 0, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        Assert.assertEquals("1", Minesweeper.sweep(grid, 0, 0));
        Assert.assertEquals("3", Minesweeper.sweep(grid, 1, 2));
        Assert.assertEquals("0", Minesweeper.sweep(grid, 2, 3));
    }
}
