class Solution
{

    public static void bubbleSort(int[] arr) 
    {
       
        int n = arr.length;

        for (int j = 1; j <= n - 1; j++) 
        {
            for (int i = 0; i < n - 1; i++) 
            {
                if (arr[i] > arr[i + 1]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
