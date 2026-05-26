class Solution {
    public int[] plusOne(int[] arr) {
        int sum=0;
        int carry = 1;
        int n = arr.length;
        for(int i=n-1; i>=0; i--)
        {
            sum = arr[i] + carry;
            arr[i]=sum%10;
            carry = sum/10;
            if(carry==0) return arr;
        }

        int[] ans = new int[n+1];
        ans[0]= carry;
        int i = 1;
        while(i<n+1){
            ans[i] = arr[i-1];
            i++;
        }
            
         return ans;   
    }
}
