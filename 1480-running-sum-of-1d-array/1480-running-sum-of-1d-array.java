// 1480. Running Sum of 1d Array (Easy) | Topics: Array, Prefix Sum
// Approach: Keep a running total and overwrite nums[i] with it (prefix sum, in place).
// Time: O(n) | Space: O(1) (input array is modified; use a new array if it must be preserved)
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
