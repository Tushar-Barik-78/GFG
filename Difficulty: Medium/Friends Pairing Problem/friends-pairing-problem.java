// User function Template for Java

class Solution {
    
    public static long fp(int n,long[] dp){
       if(n == 1) return 1;
        if(n == 2) return 2;
        if(dp[n] != 0) return dp[n];

        return dp[n] = fp(n-1,dp)+(n-1)*fp(n-2,dp);
    }
    public long countFriendsPairings(int n) {
        // code here
        if(n == 1) return 1;
        if(n == 2) return 2;
        long[] dp = new long[n+1];
        
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }
}
