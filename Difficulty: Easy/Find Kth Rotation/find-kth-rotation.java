class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int count =1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        
        
        return count%arr.length;
    }
}