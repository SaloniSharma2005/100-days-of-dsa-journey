class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {

            StringBuilder rev = new StringBuilder(word);
            ans.append(rev.reverse()).append(" ");
        }

        return ans.toString().trim();
    }
}
