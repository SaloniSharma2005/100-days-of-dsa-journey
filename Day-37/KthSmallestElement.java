import java.util.Arrays;

class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Sort the array
        Arrays.sort(arr);
        
        
        return arr[k - 1];
    }
}
