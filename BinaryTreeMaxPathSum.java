class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreeMaxPathSum {
    private int maxPathSum = Integer.MIN_VALUE;  // Initialize a variable to store the maximum path sum

    public int maxPathSum(TreeNode root) {
        findMaxPathSum(root);  // Call the helper method to calculate the maximum path sum
        return maxPathSum;  // Return the overall maximum path sum
    }

    private int findMaxPathSum(TreeNode node) {
        if (node == null) {
            return 0;  // If the node is null, return 0 (base case)
        }

        // Calculate the maximum path sum for the left and right subtrees
        int leftMax = Math.max(findMaxPathSum(node.left), 0);  // Get the maximum path sum of the left subtree
        int rightMax = Math.max(findMaxPathSum(node.right), 0);  // Get the maximum path sum of the right subtree

        // Calculate the maximum path sum passing through the current node
        int currentMax = node.val + leftMax + rightMax;

        // Update the overall maximum path sum if the current path is greater
        maxPathSum = Math.max(maxPathSum, currentMax);

        // Return the maximum path sum that can be extended from this node to its parent
        return node.val + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(-25);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        BinaryTreeMaxPathSum solution = new BinaryTreeMaxPathSum();  // Create an instance of the solution class
        int maxPathSum = solution.maxPathSum(root);  // Calculate the maximum path sum
        System.out.println("Maximum Path Sum: " + maxPathSum);  // Print the result
    }
}
