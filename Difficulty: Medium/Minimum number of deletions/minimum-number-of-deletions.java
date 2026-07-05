class Solution {
    public int minDeletions(String s) {
        return s.length() - longestPalinSubseq(s);
    }
    
    private int longestPalinSubseq(String s) {
        StringBuilder a = new StringBuilder(s);
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] arr: dp)
            Arrays.fill(arr, -1);
        return lcs(n - 1, n - 1, new StringBuilder(s), new StringBuilder(s).reverse(), dp);
    }

    private int lcs(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){

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