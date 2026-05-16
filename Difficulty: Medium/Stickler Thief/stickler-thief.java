class Solution {
    public int findMaxSum(int arr[]) {
        // code here
         int n = arr.length;
        int[] dp = new int[n];
        
        for(int i=0;i<n;i++){
            if(i == 0) dp[i] = arr[i];
            else{
                int op1= arr[i] + ((i == 1)? 0 :dp[i-2]);
                int op2 = dp[i-1];
                dp[i] = Math.max(op1,op2);
            }
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }
}