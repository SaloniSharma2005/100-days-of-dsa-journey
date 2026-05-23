class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int start =-1;
        int end = -1;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(x!=arr[i])
            continue;
            
            if(start==-1)
            start=i;
            end =i;
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(start);
        list.add(end);
        return list;
    }
}
