// User function Template for Java

class Solution {
    public ArrayList<Integer> valid(int arr[]) {
        // code here.
        ArrayList<Integer> ans =  new ArrayList<>();
        int left = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) {
                if(arr[i] != left){
                    ans.add(arr[i]);
                } else {
                    ans.remove(ans.size() - 1);
                    ans.add(arr[i] * 2);
                }
                
                left = arr[i];
            }
        }
        
        
        
        for(int i = ans.size(); i < arr.length; i++){
            ans.add(0);
        }
        
        return ans;
    }
}