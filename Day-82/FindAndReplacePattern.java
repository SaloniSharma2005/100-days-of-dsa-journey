class Solution {

    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans = new ArrayList<>();

        for (String word : words) {

            if (match(word, pattern)) {
                ans.add(word);
            }
        }

        return ans;
    }

    private boolean match(String word, String pattern) {

        HashMap<Character, Character> mapWP = new HashMap<>();
        HashMap<Character, Character> mapPW = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char c1 = word.charAt(i);
            char c2 = pattern.charAt(i);

            if (mapWP.containsKey(c1)) {

                if (mapWP.get(c1) != c2) {
                    return false;
                }

            } else {

                mapWP.put(c1, c2);
            }

            if (mapPW.containsKey(c2)) {

                if (mapPW.get(c2) != c1) {
                    return false;
                }

            } else {

                mapPW.put(c2, c1);
            }
        }

        return true;
    }
}
