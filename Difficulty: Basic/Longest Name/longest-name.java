
class Solution {
    public String longest(List<String> arr) {
        String longestStr = "";
        
        for(String str : arr) {
            if(str.length() > longestStr.length()) {
                longestStr = str;
            }
        }
        
        return longestStr;
    }
}
