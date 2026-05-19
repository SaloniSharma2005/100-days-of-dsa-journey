class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        int n = A.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<n; i++)
        {
            left[i] = set.size();
            set.add(A[i]);
        }
        set.clear();
        for(int i=n-1; i>=0; i--)
        {
            right[i] = set.size();
            set.add(A[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ans.add(left[i] - right[i]);
        }
        return ans;
    }
}
