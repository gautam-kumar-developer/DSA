// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        
        long ans = 0;
        
        boolean dateType = false;
        
        if(date % 2 == 0) {
            dateType = true;
        }
        
        for(int i = 0; i < car.length; i++) {
            if((car[i] % 2 == 0) != dateType) {
                ans += fine[i];
            }
        }
        
        return ans;
        
    }
}