// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        
        String ans="";
        int minlength=Integer.MAX_VALUE;
        
        for(String str:arr){
            minlength=Math.min(minlength, str.length());
        }
        
        for(int i=1;i<=minlength;i++){
            boolean bool=true;
            
            String sub=arr[0].substring(0,i);
            for(String str:arr){
                if(!str.substring(0,i).equals(sub)){
                  
                   return ans;
                }
               
            }
            if(bool){
                ans=sub;
            }
        }
        
        return ans;
    }
}