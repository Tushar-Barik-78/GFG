// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        
        ArrayList<Integer> neg = new ArrayList<>();
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr[index++] = arr[i];
            }else{
                neg.add(arr[i]);
            }
        }
        
        for(int i=0;i<neg.size();i++){
            arr[index++] = neg.get(i);
        }
        
        
    }
}