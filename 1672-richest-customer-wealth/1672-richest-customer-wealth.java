// 1672. Richest Customer Wealth (Easy) | Topics: Array, Matrix
// Approach: Sum each customer's row (their wealth) and track the maximum.
// Time: O(m * n) | Space: O(1)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
