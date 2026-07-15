class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '-') {
                continue;
            }

            if (count == k) {
                ans.append('-');
                count = 0;
            }

            ans.append(Character.toUpperCase(ch));
            count++;
        }

        return ans.reverse().toString();
    }
}
