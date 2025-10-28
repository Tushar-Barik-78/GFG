/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Solution {
    public static void sum(Node root , int[] ans,int num){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            ans[0] += num*10+root.data;
            return;
        }
        
        
        sum(root.left,ans,num*10+root.data);

        sum(root.right,ans,num*10+root.data);
    }
    public static int treePathsSum(Node root) {
        int[] ans = new int[1];
        sum(root,ans , 0);
        
        return ans[0];
    }
}