class Solution {
public:
    int sum(int digit) {
        int sum = 0;
        while (digit) {
            sum += digit % 10;
            digit = digit / 10;
        }
        return sum;
    }
    int minElement(vector<int>& nums) {
        int minEle = INT_MAX;
        for (int i = 0; i < nums.size(); i++) {
            int res = sum(nums[i]);
            minEle = min(minEle, res);
        }
        return minEle;
    }
};