class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTree3 {

    // Recursive method to find the maximum value in the binary tree
    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;  // Return smallest possible int if node is null
        }

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        BinaryTree3 tree = new BinaryTree3();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(25);

        System.out.println("Maximum value in the tree: " + tree.findMax(root));  // Output: 30
    }
}
