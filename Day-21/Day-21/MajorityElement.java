class Solution {
    int majorityElement(int arr[]) {
        // code here
        int count = 0;
        int ele = -1;
        
        for(int i=0; i<arr.length; i++)
        {
            if(count == 0)
            {
                ele = arr[i];
                count = 1;
            }
            else if(ele == arr[i])
            {
                count ++;
            }
            else
            {
                count--;
            }
        }
        for(int i=0;i<arr.length; i++)
        {
            if(ele == arr[i])
            {
                count++;
            }
        }
        if(count > arr.length/2)
        {
            return ele;
        }
        return -1;
    }
}
