class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTree1 {

    // Method to count leaf nodes (nodes with no children)
    public int countLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;  // no nodes here
        }
        if (root.left == null && root.right == null) {
            return 1;  // this is a leaf node
        }
        // Recur for left and right subtree
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Total leaf nodes: " + tree.countLeafNodes(root));  // Output: 3
    }
}
