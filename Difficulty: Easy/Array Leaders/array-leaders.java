class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0,arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= ans.get(0) ){
                ans.add(0 , arr[i]);
            }
        
            
        }
        return ans;
    }
}
