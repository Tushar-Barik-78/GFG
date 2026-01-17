class Solution {
    public boolean areIsomorphic(String s1, String s2) {
HashMap<Character , Character> map1 = new HashMap<>();
HashMap<Character , Character> map2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(map1.get(ch1) != null && map1.get(ch1) != ch2){
                return false;
            }
            if(map2.get(ch2) != null && map2.get(ch2) != ch1){
                return false;
            }
            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
            
        }
        return true;
    }
}