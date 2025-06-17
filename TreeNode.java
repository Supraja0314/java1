// Definition for a binary tree node and tree traversal methods
class TreeNode {
    int value;
    TreeNode left, right;

    // Constructor
    public TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

public class BinaryTreeTraversal {

    // Inorder Traversal: Left -> Root -> Right
    public void inorder(TreeNode node) {
        if (node != null) {D:

            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    // Postorder Traversal: Left -> Right -> Root
    public void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Main method to test the traversals
    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        // Constructing a binary tree:
        //        1
        //       / \
        //      2   3
        //     / \    
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        tree.inorder(root);  // Output: 4 2 5 1 3

        System.out.println("\nPostorder Traversal:");
        tree.postorder(root);  // Output: 4 5 2 3 1
    }
}
