class Solution {
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        inOrderTraversal(root, ans, low, high);
        return ans;
    }
    
    private static void inOrderTraversal(Node root, ArrayList<Integer> arrList, int l, int h) {
        if(root == null)
            return;
            
        inOrderTraversal(root.left, arrList, l, h);
        int val = root.data;
        if(val >= l && val <= h)
            arrList.add(val);
        inOrderTraversal(root.right, arrList, l, h);
    }
}