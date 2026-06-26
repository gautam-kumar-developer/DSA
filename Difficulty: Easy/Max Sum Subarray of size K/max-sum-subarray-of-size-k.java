class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		int n = arr.length;
		int start = 0, end = k - 1;
		int sum = 0;
		for (int i = start; i <= end; i++)
			sum += arr[i];
		int max = sum;
		
		for (int i = end + 1; i < n; i++) {
			sum = sum - arr[i - k] + arr[i];
			max = Math.max(max, sum);
		}
		
		return max;
		
	}
}
