import java.util.*;

class Solution {
    
    public ArrayList<Integer> findSubarray(int arr[]) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        long maxSum = -1;
        long sum = 0;
        
        int start = 0;
        int ansStart = 0;
        int ansEnd = -1;
        
        for(int i = 0; i < arr.length; i++) {
           
            if(arr[i] < 0) {
                
                sum = 0;
                start = i + 1;
            }
            else {
                
                sum += arr[i];
                
                if(sum > maxSum || 
                  (sum == maxSum && (i - start > ansEnd - ansStart))) {
                    
                    maxSum = sum;
                    ansStart = start;
                    ansEnd = i;
                }
            }
        }
       
        if(ansEnd == -1) {
            res.add(-1);
            return res;
        }
        
        
        for(int i = ansStart; i <= ansEnd; i++) {
            res.add(arr[i]);
        }
        
        return res;
    }
}
