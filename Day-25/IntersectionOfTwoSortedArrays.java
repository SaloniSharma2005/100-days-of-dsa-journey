class Solution {
    public ArrayList<Integer> intersection(int a[], int b[]) {
        // code here
        int i=0;
        int j=0;
        
        int n1 = a.length;
        int n2 = b.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i<n1 && j<n2)
        {
            if(a[i] ==b[j])
            { 
              if(list.size()==0 || list.get(list.size()-1)!=a[i])
              {
                  list.add(a[i]);
              }
              i++;
              j++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
            return list;  
    }
