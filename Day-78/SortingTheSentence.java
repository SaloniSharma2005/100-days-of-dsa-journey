class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (String word : words) {

            int index = word.charAt(word.length() - 1) - '0';

            ans[index - 1] = word.substring(0, word.length() - 1);
        }

        StringBuilder result = new StringBuilder();

        for (String word : ans) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }
}
