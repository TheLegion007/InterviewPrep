class Solution {
public:
    int numberOfSpecialChars(string word) {
        unordered_set<char> s;
        // 
        for (int i = 0; i < word.size(); i++) {
            s.insert(word[i]);
        }

        int matchingPairs = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            if (s.count(i) && s.count(i - 'a' + 'A')) {
                matchingPairs++;
            }
        }

        return matchingPairs;
    }
};