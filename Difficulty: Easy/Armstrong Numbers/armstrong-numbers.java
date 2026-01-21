// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
          int n1=n,sum=0;
        while(n>0){
            int r = n%10;
            sum+=r*r*r;
            n/=10;
        }
        if(sum==n1){
            return true;
        }
        return false;
    }
}