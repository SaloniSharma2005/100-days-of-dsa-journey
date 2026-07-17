class Solution {
    public int maxDepth(String s) {
        int Depth =0;
        int maxDepth = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                Depth++;
                maxDepth = Math.max(maxDepth,Depth);
            }
            else if(ch == ')')
            {
                Depth--;
            }
        }
        return maxDepth;
    }
}
