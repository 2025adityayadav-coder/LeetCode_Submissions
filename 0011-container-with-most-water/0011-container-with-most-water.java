class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int head = 0;
        int tail = n-1;
        int maxArea = 0;
        int Area = 0;

        while(head<tail){
            if(height[head] < height[tail]){
                Area = height[head] * (tail-head);
                if(Area>maxArea){
                    maxArea = Area;
                }
                head++;
            }
            else{
                Area = height[tail] * (tail-head);
                if(Area>maxArea){
                    maxArea = Area;
                }
                tail--;
            }
        }
        return maxArea;
    }
}