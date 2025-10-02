class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int val : arr) {
            if(val > max)
                max = val;
            if(val < min)
                min = val;
        }
        
        ans.add(min);
        ans.add(max);
        
        return ans;
    }
}
