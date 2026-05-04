class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
int current =arr[0];
int maxsofar=arr[0];
for(int i=1;i<arr.length;i++){
    current =Math.max(arr[i],current+arr[i]);
    maxsofar=Math.max(current,maxsofar);
}
return maxsofar;
    }
}
