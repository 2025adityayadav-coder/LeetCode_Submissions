class Solution {
    public void moveZeroes(int[] nums) {
       int head = 0;
       int tail = 0;
       while(head < nums.length){
        if(nums[head] != 0){
            nums[tail] = nums[head];
            head++;
            tail++;
        }
        else{
            head++;
        }
       }
       for(int i = tail; i<nums.length; i++){
        nums[i] = 0;
       }
    }
}