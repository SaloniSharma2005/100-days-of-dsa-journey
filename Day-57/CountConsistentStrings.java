class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            allow[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean valid = true;

            for (char ch : word.toCharArray()) {
                if (!allow[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}
