// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int f=-1;
       int c=-1;
       
       for(int num:arr){
           if(num<=x && (f == -1 || num > f)){
               f = num;
           }
           if(num>=x && (c== -1 || num < c)){
               c = num;
           }
       }
       
       return new int[]{f,c};
    }
}
