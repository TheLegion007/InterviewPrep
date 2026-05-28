class Solution {
public:
    int numberOfSpecialChars(string word) {
        // TC : O(n + 26) ≈ O(n)
        // SC : O(1)
        vector<int> lastlower(26, -1);
        vector<int> firstupper(26, -1);

        for (int i = 0; i < word.size(); i++) {
            char c = word[i];
            if (c >= 'a' && c <= 'z') {
                lastlower[word[i] - 'a'] = i;
            } else if (c >= 'A' && c <= 'Z') {
                if (firstupper[word[i] - 'A'] == -1) {
                    firstupper[word[i] - 'A'] = i;
                }
            }
        }

        int countSpecialChars = 0;
        for (int i = 0; i < 26; i++) {
            if (lastlower[i] != -1 && firstupper[i] != -1 &&
                lastlower[i] < firstupper[i]) {
                countSpecialChars++;
            }
        }
        return countSpecialChars;
    }
};