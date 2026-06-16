class Solution {
	int search(int[] arr, int key) {
		int pivot = findPivot(arr); // index of smallest element
		
		int ans = binarySearch(arr, 0, pivot - 1, key);
		if (ans != -1)
			return ans;
		
		return binarySearch(arr, pivot, arr.length - 1, key);
	}
	
	int findPivot(int[] arr) {
		int l = 0, h = arr.length - 1;
		
		while (l < h) {
			int mid = l + (h - l) / 2;
			
			if (arr[mid] > arr[h])
				l = mid + 1;
			else
				h = mid;
		}
		
		return l;
	}
	
	int binarySearch(int[] arr, int l, int h, int x) {
		int ans = -1;
		
		while (l <= h) {
			int mid = l + (h - l) / 2;
			
			if (arr[mid] == x) {
				ans = mid;
				break;
			}
			else if (arr[mid] < x) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return ans;
	}
}
