// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        // Gautam's code here
        int fLargest, sLargest, tLargest, fSmallest, sSmallest;
        fLargest = sLargest = tLargest = Integer.MIN_VALUE;
        fSmallest = sSmallest = Integer.MAX_VALUE;
        for(int elmt : arr) {
            if(elmt > fLargest){
                tLargest = sLargest;
                sLargest = fLargest;
                fLargest = elmt;
            } else if(elmt > sLargest) {
                tLargest = sLargest;
                sLargest = elmt;
            } else if(elmt > tLargest) {
                tLargest = elmt;
            }
            
            if(elmt < fSmallest){
                sSmallest = fSmallest;
                fSmallest = elmt;
            } else if (elmt < sSmallest) {
                sSmallest = elmt;
            }
        }
        return Math.max(fLargest * sLargest * tLargest, fSmallest * sSmallest * fLargest);
    }
}
