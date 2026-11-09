// 66. Plus One (Easy) | Topics: Array, Math
// Approach: Walk from the least significant digit. A 9 becomes 0 and the carry moves left;
//           the first non-9 digit is incremented and we stop. If every digit was 9
//           (e.g. [9,9,9]) the answer is 1 followed by zeros.
// Time: O(n) | Space: O(1) (O(n) only for the all-9s case, where a new array is required)
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
