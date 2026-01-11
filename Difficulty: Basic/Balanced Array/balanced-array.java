// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int ls = 0;
        int rs = 0;
        int n = arr.size();
        for(int i=0;i<n;i++){
            if(i < n/2)
            ls += arr.get(i);
            else rs+= arr.get(i);
        }
        
        return Math.abs(ls-rs);
    }
}