// 1929. Concatenation of Array (Easy) | Topics: Array, Simulation
// Approach: Allocate an array of size 2n and write each element at positions i and i + n.
// Time: O(n) | Space: O(n) (output array)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
