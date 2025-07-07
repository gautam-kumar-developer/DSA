// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        //Gautam's Code Here
        int n1 = arr1.size();
        int n2 = arr2.size();
        int n3 = arr3.size();
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2 && k < n3) {
                int a = arr1.get(i) , b = arr2.get(j), c = arr3.get(k);
            if(a == b && b == c) {
                ans.add(arr1.get(i));
                while(i <n1 && arr1.get(i) == a) 
                    i++;
                while(j < n2 && arr2.get(j) == b) 
                    j++;
                while(k < n3 && arr3.get(k) == c) 
                    k++;
            } 
            else if(arr1.get(i) < arr2.get(j))
                i++;
            else if(arr2.get(j) < arr3.get(k))
                j++;
            else 
                k++;
        }
        return ans;
    }
}