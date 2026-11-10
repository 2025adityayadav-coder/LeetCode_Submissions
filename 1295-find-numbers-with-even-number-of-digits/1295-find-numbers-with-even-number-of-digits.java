class Solution {
    public int findNumbers(int[] nums) {
        int output = 0;
        for(int i = 0; i<nums.length; i++){
            int divisionCount = 0;
            int temp = nums[i];
           while(temp > 0){
            temp = temp / 10;
            divisionCount++;
           }
            if( divisionCount % 2 == 0){
                output++;
            }
        }
        return output;
    }
}