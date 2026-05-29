class Solution {
    // Time complexity: O(N logM)  ,   N = number of elements in the array  ,  M = maximum value in the array
    // Space complexity : O(1) 
    
    public int minElement(int[] nums) {
        int minEle = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length; i++) {

            int digit = nums[i];
            int sum = 0;

            while(digit >  0) {
                sum += digit % 10;
                digit /= 10;
            }
            
            minEle = Math.min(minEle, sum);
        }
        return minEle;
    }
}