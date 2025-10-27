class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr);
        int maxSum = 0;
        int n = arr.size();
        for(int i=n-1;i>=n-k;i--){
            maxSum += arr.get(i);
            
        }
        
        return maxSum;
    }
}