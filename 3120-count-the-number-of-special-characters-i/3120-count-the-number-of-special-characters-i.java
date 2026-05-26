
// TC :  O(n) -> Single traversal through string.

// SC :  O(1) -> Fixed-size arrays of length 26.

class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower =  new boolean[26];
        boolean[] upper =  new boolean[26];

        /*
        for (char ch : word.toCharArray()) {

            // Lowercase character
            if (Character.isLowerCase(ch)) {

                lower[ch - 'a'] = true;

            } else {

                // Uppercase character
                upper[ch - 'A'] = true;
            }
        }
        */

        for(int i = 0; i < word.length(); i++) {
            char c =  word.charAt(i);
            if(c >= 'a' &&  c <= 'z') {
                lower[c - 'a'] = true;
            }
            else if(c >= 'A' && c <= 'Z') {
                upper[c - 'A'] = true;
            }
        }

        int matchingPair = 0;
        for(int i = 0; i< 26; i++) {
            if(lower[i] && upper[i] ) {
                matchingPair++;
            }
        }
        return matchingPair;
    }
}
