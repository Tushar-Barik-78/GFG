/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
       
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node h1 = reverse(head1);
        Node h2 = reverse(head2);
        
        Node dn = new Node(-1);
        Node t = dn;
        int c= 0;
        int sum ;
        
        while(h1 != null || h2 != null){
            sum = c;
            if(h1 != null) sum += h1.data;
            if(h2 != null) sum += h2.data;
            
            c = sum/10;
            sum = sum%10;
            Node nn = new Node(sum);
            dn.next = nn;
            dn = dn.next;
            
            
            if(h1 != null) h1 = h1.next;
            if(h2 != null) h2 = h2.next;
        }
        
        if(c != 0){
            Node nn = new Node(c);
            dn.next = nn;
        }
        
        
       Node res = reverse(t.next);
       Node ans = res;
        while(ans.data == 0){
            ans = ans.next;
        }
        return ans;
        
        
    }
}