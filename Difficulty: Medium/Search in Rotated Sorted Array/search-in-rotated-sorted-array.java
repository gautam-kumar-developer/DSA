class Solution {
    int search(int[] arr, int key) {
        int n = arr.length;
        
        if (n == 1) {
            return arr[0] == key ? 0 : -1;
        }
    
        int left = 0, right = n - 1;
        int pivot = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                pivot = mid + 1;
                break;
            } else if (arr[mid] >= arr[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If no pivot was found, the array wasn't rotated
        if (pivot == -1) {
            pivot = 0;
        }
    
        if (key >= arr[pivot] && key <= arr[n - 1]) {
            left = pivot;
            right = n - 1;
        } else {
            left = 0;
            right = pivot - 1;
        }
    
        // Binary search on the selected half
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}