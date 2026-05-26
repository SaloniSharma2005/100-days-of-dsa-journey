class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=  nums.length;
        int L = 0;
        int R = n-1;
        int ans []=new int[n];

        for(int i=n-1; i>=0; i--)
        {
            if(Math.abs(nums[L])>Math.abs(nums[R]))
            {
                ans[i] = nums[L]*nums[L];
                L++;
            }
            else
            {
                ans[i]=nums[R]*nums[R];
                R--;
            }
        } 
        return ans;
    }
}
