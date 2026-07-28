class Solution {
    public int maxScore(String s) {

        int totalOnes = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                totalOnes++;
            }
        }

        int leftZero = 0;
        int rightOne = totalOnes;
        int maxScore = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '0') {
                leftZero++;
            } else {
                rightOne--;
            }

            maxScore = Math.max(maxScore, leftZero + rightOne);
        }

        return maxScore;
    }
}
