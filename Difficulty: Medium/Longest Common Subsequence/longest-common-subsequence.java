class Solution {
    static int lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m][n];
        for(int[] arr: dp)
            Arrays.fill(arr, -1);
        return lcs(m - 1, n - 1, new StringBuilder(a), new StringBuilder(b), dp);
    }

    private static int lcs(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){

        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = 1 + lcs(i - 1, j - 1, a, b, dp);
        }

        int pick = lcs(i, j - 1, a, b, dp);
        int skip = lcs(i - 1, j, a, b, dp);
        return dp[i][j] = Math.max(pick, skip);
    }
    
    
}