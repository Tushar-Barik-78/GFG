// User function Template for Java

class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
        if(c==0) return a==b ? 1 : 0;
        else return (b-a)%c == 0 && (b-a)/c >= 0 ? 1 : 0;
    }
}