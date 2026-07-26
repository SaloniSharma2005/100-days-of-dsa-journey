class Solution {

    public int[] vowelStrings(String[] words, int[][] queries) {

        int n = words.length;

        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) {

            String word = words[i];

            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            int value = 0;

            if (isVowel(first) && isVowel(last)) {
                value = 1;
            }

            if (i == 0) {
                prefix[i] = value;
            } else {
                prefix[i] = prefix[i - 1] + value;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = queries[i][0];
            int right = queries[i][1];

            if (left == 0) {
                ans[i] = prefix[right];
            } else {
                ans[i] = prefix[right] - prefix[left - 1];
            }
        }

        return ans;
    }

    private boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}
