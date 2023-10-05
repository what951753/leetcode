package binaryTree;

public class MaximumDepthBinaryTree {
    //https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

    public int maxDepth(TreeNode root) {

        if(root != null){
            int depthL = maxDepth(root.left);
            int depthR = maxDepth(root.right);
            return Math.max(depthL, depthR) +1;
        }else {
            return 0;
        }
    }
}
