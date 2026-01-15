// User function Template for Java

class Solution {

    public int findMissing(int[] arr1, int[] arr2) {
        // code here
        int sum = 0;
        for(int i:arr1){
            sum+=i;
        }
        
        for(int i:arr2){
            sum-=i;
        }
        
        
        return sum;
    }
}