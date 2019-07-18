import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {

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
        Assert.assertEquals(0, FindMax.max(tree));
    }

    /**
     *        5
     *      /  \
     *     17   11
     *    /    /  \
     *   9    12   2
     */
    @Test
    public void testTree() {
        TreeNode tree = new TreeNode(5,
                new TreeNode(17, new TreeNode(9, null, null), null),
                new TreeNode(11, new TreeNode(12, null, null), new TreeNode(2, null, null))
        );
        Assert.assertEquals(17, FindMax.max(tree));
    }
}
