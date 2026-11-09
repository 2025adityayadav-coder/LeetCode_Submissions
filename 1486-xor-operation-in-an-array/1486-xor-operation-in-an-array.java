// 1486. XOR Operation in an Array (Easy) | Topics: Math, Bit Manipulation
// Approach: Build nums[i] = start + 2 * i, then XOR all elements together.
// Time: O(n) | Space: O(n)
// Optimization: the array is unnecessary - XOR (start + 2 * i) directly in one loop for O(1) space.
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int output = 0;
        for (int j = 0; j < n; j++) {
            output ^= nums[j];
        }
        return output;
    }
}
