class Solution {
public:
    int search(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size() - 1;

        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                index = mid;
                return index;
            }
            // left part sorted
            else if (nums[left] <= nums[mid]) {
                // if target lies in left sorted part
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // right part sorted
            else {
                // if target lies in right sorted part
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
};