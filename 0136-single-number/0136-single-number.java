// 136. Single Number (Easy) | Topics: Array, Bit Manipulation
// Approach (Brute Force): For each element, scan the whole array to see whether a duplicate exists.
// Time: O(n^2) | Space: O(1)
// NOTE: Does NOT meet the problem's O(n) requirement. See 0136-single-number-optimized.java.
class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean unique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return nums[i];
            }
        }
        return -1;
    }
}
