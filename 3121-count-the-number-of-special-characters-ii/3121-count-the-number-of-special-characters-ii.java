class Solution {
    public int numberOfSpecialChars(String word) {
        // TC : O(n + 26) ≈ O(n)
        // SC : O(1)
        int [] lastLower = new int[26];
        int [] firstUpper = new int[26]; 

        for(int i  =0  ; i< 26 ; i++) {
            lastLower[i] = -1;
            firstUpper[i] = -1;
        }

        for(int i = 0 ; i< word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)) {
                lastLower[ch-'a'] = i;
            }
            else if(Character.isUpperCase(ch)) {
                if(firstUpper[ch-'A'] == -1) {
                    firstUpper[ch - 'A'] = i;
                }
            }
        }

        int countChar = 0;
        for(int i = 0 ; i < 26; i++) {
            if(lastLower[i] != -1 && firstUpper[i] != -1 && lastLower[i] < firstUpper[i] ) {
                countChar++;
            }
        }

        return countChar;
    }
}