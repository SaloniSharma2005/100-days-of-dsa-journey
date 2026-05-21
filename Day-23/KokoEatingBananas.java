class Solution {

    public int kokoEat(int[] arr, int k) {

        int low = 1;

        int high = 0;

       
        for(int bananas : arr)
        {
            high = Math.max(high, bananas);
        }

        int ans = high;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            long hours = 0;

           
            for(int bananas : arr)
            {
                hours += (bananas + mid - 1) / mid;
            }

            
            if(hours <= k)
            {
                ans = mid;

                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return ans;
    }
}
