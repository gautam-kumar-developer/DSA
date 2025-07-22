class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // Solution here
        int n = txt.length();
        int m = pat.length();
        
        // Creating a LPS arr
        int[] lps = new int[m];
        constructLps(pat, lps);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Creating two pointer for matching
        int i = 0, j = 0;
        
        while(i < n) {
            //if elements matches
            if(pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
                // if all pattern matches
                if(j == m) {
                    ans.add(i - j);
                    j = lps[j - 1];
                }
            } 
            
            // its a mismatch
            else {
                if(j != 0) {
                    j = lps[j - 1];
                }
                else {
                    i++;
                }
            }
        }
        
        return ans;
    }
    
    
    // method to construct the lps
    private void constructLps(String pat, int[] lps) {
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < pat.length()){
            
            // if character of pat at len matches with the character of pat at i
            if(pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            
            //else there is a mismatch
            else {
                if(len != 0) {
                    len = lps[len - 1];
                }
                
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}

// Time : O(n + m) 

