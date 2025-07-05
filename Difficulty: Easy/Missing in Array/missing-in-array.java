class Solution {
    int missingNum(int arr[]) {
        // Gautam's code here
        long arrSum = 0;
        for(int elmt : arr)
            arrSum += elmt;
        long n = arr.length + 1;
        long sumOfNatural = (n * (n + 1)) / 2;
        return (int)(sumOfNatural - arrSum);
    }
}