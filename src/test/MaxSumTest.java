import org.junit.Assert;
import org.junit.Test;

public class MaxSumTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    /**
     * null
     */
    @Test
    public void testNullTree() {
        TreeNode tree = null;
        Assert.assertEquals(0, MaxSum.maxSum(tree));
    }

    /**
     *        5
     *      /   \
     *    -22    11
     *    / \    / \
     *   9  50  9   2
     */
    @Test
    public void testTree() {
        TreeNode tree = new TreeNode(5,
                new TreeNode(-22, new TreeNode(9, null, null), new TreeNode(50, null, null)),
                new TreeNode(11, new TreeNode(9, null, null), new TreeNode(2, null, null))
        );
        Assert.assertEquals(33, MaxSum.maxSum(tree));
    }

}
