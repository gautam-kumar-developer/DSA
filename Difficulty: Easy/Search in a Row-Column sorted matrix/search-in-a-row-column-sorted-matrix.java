class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n = mat.length;
        int m = mat[0].length;
        
        int i = 0, j = m - 1;
        
        while(i < n && j >= 0) {
            
            //if mat[i][j] > x then move to left cell
            if(mat[i][j] > x) {
                j--;
            }
            
            //else if mat[i][j] < x then move to downward cell
            else if(mat[i][j] < x) {
                i++;
            }
            
            // else mat[i][j] is equal to x then return true
            else {
                return true;
            }
        }
        
        // if here means, x not found
        return false;
    }
}