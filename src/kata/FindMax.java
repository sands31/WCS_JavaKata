public class FindMax {

    public static int max(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return Math.max(root.getValue(),
                Math.max(max(root.getLeft()), max(root.getRight())));
    }
}
