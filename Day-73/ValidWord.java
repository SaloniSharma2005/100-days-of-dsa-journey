class Solution {
    public boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {

            if (Character.isLetter(ch)) {

                char lower = Character.toLowerCase(ch);

                if (lower == 'a' || lower == 'e' ||
                    lower == 'i' || lower == 'o' ||
                    lower == 'u') {

                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }

            else if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return hasVowel && hasConsonant;
    }
}
