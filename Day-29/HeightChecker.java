class Solution {
    public int heightChecker(int[] heights) {
        int n= heights.length;
        int arr [] = new int[n];
        int count =0;

         arr= heights.clone();
            Arrays.sort(arr);
       
        for(int i=0; i<n; i++)
        {
            if(heights[i]!=arr[i])
            {
                count++;
            }
            
        }
        return count;
    }
}
