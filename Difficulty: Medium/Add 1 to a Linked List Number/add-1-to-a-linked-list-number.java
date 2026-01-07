/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    public static Node reverse(Node head){
        Node prev = null;
    Node curr = head;

    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;

    }
    public Node addOne(Node head) {
        // code here.
        if(head == null) return null;

        head = reverse(head);

        Node temp = head;
        boolean flag= true;
        while(temp != null){
            if(temp.data < 9){
                temp.data++;
                flag = false;
                break;
            }
            temp.data = 0;
            temp = temp.next;
        }

        if(flag){
            Node newHead = new Node(1);
            newHead.next = head;
            return newHead;
        }
        
        head = reverse(head);
        return head;
    }
}