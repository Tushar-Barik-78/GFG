// User function Template for Java

class Solution {
    
    
    public static String trail(String s ){
        int index = s.indexOf('1');
        return (index == -1) ? "0" : s.substring(index);
    }
    public String addBinary(String s1, String s2) {
        // code here
        s1 = trail(s1);
        s2 = trail(s2);
        
        int i = s1.length()-1;
        int j = s2.length()-1;
        int c = 0;

        StringBuilder ans = new StringBuilder();
         while(i>=0 || j>=0 || c!=0){
            int sum = c;

            if(i>=0) sum += s1.charAt(i--)-'0';
            if(j>=0) sum += s2.charAt(j--)-'0';

            ans.append(sum%2);
            c = sum/2;


         }

         return ans.reverse().toString();

    }
}