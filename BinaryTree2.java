class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTree2 {

    // Method to sum all node values in the binary tree
    public int sumNodes(TreeNode root) {
        if (root == null) {
            return 0;  // base case: no node here
        }
        // sum current node value + sum of left subtree + sum of right subtree
        return root.val + sumNodes(root.left) + sumNodes(root.right);
    }

    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Sum of all nodes: " + tree.sumNodes(root));  // Output: 15
    }
}
