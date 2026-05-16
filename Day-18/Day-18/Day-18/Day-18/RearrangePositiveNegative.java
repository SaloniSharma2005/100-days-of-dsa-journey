class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int num : arr)
        {
            if(num >=0)
             pos.add(num);
            else
             neg.add(num);
        }
        int i=0;
        int p=0;
        int n=0;
        
        while(p< pos.size() && n<neg.size())
        {
            arr.set(i++, pos.get(p++));
            arr.set(i++, neg.get(n++));
        }
        while(p<pos.size())
        {
            arr.set(i++,pos.get(p++));
        }
        
        while(n<neg.size())
        {
            arr.set(i++,neg.get(n++));
        }
    }
}
