class Solution {
    public boolean canServe(int[] arr) {
        // code here
        if(arr[0] > 5 ) return false;
        int fc = 0;
        int tc = 0;
        
        for(int i:arr){
            if(i == 5){
                fc++;
            }
            else if(i == 10 ){
                fc--;
                tc++;
            }else if(i == 20){
                if(tc > 0){
                    tc--;
                }else{
                    fc -=2;
                }
                
                fc--;
            }
            
            if(fc<0 || tc<0){
                return false;
            }
        }
        
        return true;
    }
}