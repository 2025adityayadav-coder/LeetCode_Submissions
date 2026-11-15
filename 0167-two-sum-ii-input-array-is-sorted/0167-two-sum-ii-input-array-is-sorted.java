class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int head = 0;
       int tail = numbers.length-1;
       int[] output = new int[2];
       
       while(head<tail){
        if(numbers[head] + numbers[tail] > target){
            tail--;
        }
        else if(numbers[head] + numbers[tail] < target){
            head++;
        }
        else{
            output[0] = head+1;
            output[1] = tail+1;
            return output;
        }
       }
       return output;
    }
}