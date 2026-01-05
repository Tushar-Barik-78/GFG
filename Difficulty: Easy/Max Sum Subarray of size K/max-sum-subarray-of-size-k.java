class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum =0;
        int l = 0;
        int r = 0;
        for(r=0;r<k;r++){
            sum += arr[r];
        }
        
        int n = arr.length;
        int max = sum;
        
        while(r<n){
            sum = sum +arr[r] - arr[l];
            
            max = Math.max(sum,max);
            l++;
            r++;
        }
        
        
        return max;
    }
}