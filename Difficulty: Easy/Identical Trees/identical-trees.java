/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node root1, Node root2) {
        // code here
         // code here
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;

        if(root1.data != root2.data) return false;

        boolean ls= isIdentical(root1.left,root2.left);
        boolean rs= isIdentical(root1.right,root2.right);

        return ls && rs;
    }
}