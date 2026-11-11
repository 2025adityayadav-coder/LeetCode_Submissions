import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int i = 0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
            }
            for(int j = 0; j<candies.length; j++){
                candies[j] = candies[j] + extraCandies;
                if(candies[j] >= max){
                    result.add(true);
                }
                else{
                    result.add(false);
                }
            }
             return result;
        }
    }