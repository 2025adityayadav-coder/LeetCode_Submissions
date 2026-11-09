// 136. Single Number (Easy) | Topics: Array, Bit Manipulation
// Approach (Optimized, XOR): a ^ a = 0 and a ^ 0 = a, and XOR is commutative/associative,
//           so all paired numbers cancel out and only the single number remains.
// Time: O(n) | Space: O(1)  -> meets the problem's linear time / constant space requirement.
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
