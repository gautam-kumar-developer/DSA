class Solution {
    boolean hasPathSum(Node root, int target) {
        if(root == null) return false;
        boolean left = hasPathSum(root.left, target - root.data);
        boolean right = hasPathSum(root.right, target - root.data);
        if(root.left == null && root.right == null && root.data == target)
            return true;
        else 
            return left || right;
    }
}