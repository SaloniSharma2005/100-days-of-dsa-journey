class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;
        
        map.put(0, -1);
        
        for (int i = 0; i < arr.length; i++) {
            
            sum += arr[i];
            
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }
            
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        return maxLen;
    }
}
