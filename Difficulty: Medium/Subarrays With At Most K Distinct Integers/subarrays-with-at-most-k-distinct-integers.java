class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int ans = 0;
        int l =0;
        
        for(int r= 0;r<arr.length;r++){
            map.put(arr[r], map.getOrDefault(arr[r],0)+1);
            
            while(l<r && map.size()>k){
                map.put(arr[l],map.getOrDefault(arr[l],0)-1);
                if(map.get(arr[l]) == 0) map.remove(arr[l]);
                l++;
            }
            
            ans += r-l+1;
            
        }
        return ans;
        
    }
}
