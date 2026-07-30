class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character, Character> map = new HashMap<>();

        char ch = 'a';

        for (int i = 0; i < key.length(); i++) {

            char current = key.charAt(i);

            if (current != ' ' && !map.containsKey(current)) {
                map.put(current, ch);
                ch++;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            char current = message.charAt(i);

            if (current == ' ') {
                ans.append(' ');
            } else {
                ans.append(map.get(current));
            }
        }

        return ans.toString();
    }
}
