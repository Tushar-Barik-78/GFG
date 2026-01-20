// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
         HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i<str2.length();i++){
            hs.add(str2.charAt(i));
        }
        
        StringBuilder ans = new StringBuilder();
        for(int i =0 ;i<str1.length();i++){
            
            if(!hs.contains(str1.charAt(i))){
                ans.append(str1.charAt(i));
            }
        }
        
        
        return ans.toString();
    }
}