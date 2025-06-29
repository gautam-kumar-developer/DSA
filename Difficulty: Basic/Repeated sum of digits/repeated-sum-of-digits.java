// User function Template for Java
class Solution {
    static int repeatedSumOfDigits(int N) {
        int digSum = sum(N);
        if (digSum < 10)    
            return digSum;
        else         
            return repeatedSumOfDigits(digSum);
    }
    
    static int sum(int N){
        int ans = 0;
        while(N > 0) {
            ans += (N % 10);
             N /= 10;
        }
        return ans;
    }
}
