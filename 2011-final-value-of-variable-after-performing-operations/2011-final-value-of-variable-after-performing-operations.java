class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int output = 0;
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                output++;
            }
            else{
                output--;
            }
        }
        return output;
    }
}