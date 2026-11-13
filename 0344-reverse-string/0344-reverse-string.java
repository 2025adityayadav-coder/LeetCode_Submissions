class Solution {
    public void reverseString(char[] s) {
      int head = 0;
      int tail = s.length-1;
      while(head<tail){
        char prevTail = s[tail];
        char prevHead = s[head];
        s[head] = prevTail;
        s[tail] = prevHead;

        tail--;
        head++;
      } 
    }
}