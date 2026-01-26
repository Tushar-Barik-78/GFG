class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        int i=0;
        int j = arr.length-1;
        
        while(i < j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                break;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if(i == j){
            ans.add(-1);
            ans.add(-1);
        }else{
        ans.add(i+1);
        ans.add(j+1);
        }

        return ans;
    }
}