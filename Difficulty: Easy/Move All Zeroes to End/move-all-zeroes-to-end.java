class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i = 0;
        for(int j = 0;j<arr.length;j++){
            if(arr[i] != 0){
                i++;
            }else if(arr[i] == 0 && arr[j] != 0){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
            }
        }
        
        
    }
}