// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        int n1= S1.length();
        int n2= S2.length();
        
        StringBuilder ans  = new StringBuilder();
        
        for(int i=n2-1;i>=0;i--){
            ans.append(S2.charAt(i));
        }
        for(int i=n1-1;i>=0;i--){
            ans.append(S1.charAt(i));
        }
        
        
        
        return ans.toString();
    }
}