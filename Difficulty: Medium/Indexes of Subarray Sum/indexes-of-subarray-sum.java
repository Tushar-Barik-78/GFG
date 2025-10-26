
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
        int sum=0;
        int l=0;
        int r=0;
        int n=arr.length;
        
        for(r=0;r<n;r++){
            sum+=arr[r];
            
            if(sum==target){
                ans.add(l+1);
                ans.add(r+1);
                
                return ans;
            }
            while(sum>target && l<=r){
                sum-=arr[l];
                l++;
                if(sum == target){
                    ans.add(l+1);
                ans.add(r+1);
                
                return ans;
                }
            }
            
        }
            ans.add(-1);
            return ans;
    }
}
