class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();

        while(!st.isEmpty()){
            arr.add(st.pop());
        }

        for(int i=0;i<arr.size();i++){
            st.push(arr.get(i));
        }

    }
}
