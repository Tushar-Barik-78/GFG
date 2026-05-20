// User function Template for Java

class Solution {
    
    public static long fp(int n,long[] dp){
        if(n == 1) return 1;
        if(n == 2) return 2;

        return fp(n-1,dp)+(n-1)*fp(n-2,dp);
    }
    public long countFriendsPairings(int n) {
        // code here
        long[] dp = new long[n];
        return fp(n,dp);
    }
}
