// 1920. Build Array from Permutation (Easy) | Topics: Array, Simulation
// Approach: Directly simulate ans[i] = nums[nums[i]].
// Time: O(n) | Space: O(n)
// Follow-up (O(1) extra space): encode both values in one int as nums[i] + n * (nums[nums[i]] % n),
// then divide every element by n.
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
