class Solution {
        
    HashMap<String, Integer> map = new HashMap<>();
    
    public int totalWays(int[] arr, int target) {
        return ways(arr, target, 0);
    }
    
    private int ways(int[] arr, int target, int i){
        if(i == arr.length) 
            return (target == 0) ? 1 : 0;
            
        String key = i + "," + target;
        if(map.get(key) != null) return map.get(key);
        int pick = ways(arr, target - arr[i], i + 1); //added 
        int skip = ways(arr, target + arr[i], i + 1); //subracted
        map.put(key, pick + skip);
        return pick + skip;
    }
    
    
}