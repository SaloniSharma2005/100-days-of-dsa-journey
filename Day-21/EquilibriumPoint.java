class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int Tsum = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            Tsum += arr[i];
        }
        int Lsum = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            int Rsum = Tsum - Lsum - arr[i];
            if(Lsum == Rsum)
            {
                return i;
            }
            Lsum +=arr[i];
        }
        return -1;
    }
}
