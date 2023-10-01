class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreeMaxPathSum {
    private int maxPathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxPathSum(root);
        return maxPathSum;
    }

    private int findMaxPathSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        //Calculate the maximum path sum for the left and right subtrees
        int leftMax = Math.max(findMaxPathSum(node.left), 0);
        int rightMax = Math.max(findMaxPathSum(node.right), 0);

        //Calculate the maximum path sum passing through the current node
        int currentMax = node.val + leftMax + rightMax;

        //Update the overall maximum path sum
        maxPathSum = Math.max(maxPathSum, currentMax);

        //Return the maximum path sum that can be extended from this node to its parent
        return node.val + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(-25);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        BinaryTreeMaxPathSum solution = new BinaryTreeMaxPathSum();
        int maxPathSum = solution.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxPathSum);
    }
}
