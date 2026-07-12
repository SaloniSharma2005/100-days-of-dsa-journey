class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];

        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int ans = 0;

        for (String word : words) {

            int[] temp = freq.clone();
            boolean valid = true;

            for (char ch : word.toCharArray()) {

                if (temp[ch - 'a'] == 0) {
                    valid = false;
                    break;
                }

                temp[ch - 'a']--;
            }

            if (valid) {
                ans += word.length();
            }
        }

        return ans;
    }
}
