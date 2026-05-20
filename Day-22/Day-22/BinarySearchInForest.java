class Solution {
    static int find_height(int tree[], int n, int k) 
    {
        int low = 0;
        int high = 0;
        
        for(int h: tree)
        {
            high = Math.max(high,h);
        }
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            long wood =0;
            for(int h : tree)
            {
                if(h>mid)
                {
                    wood +=(h-mid);
                }
            }
            if(wood==k)
            {
                return mid;
            }
            else if(wood>k)
            {
                low= mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}
