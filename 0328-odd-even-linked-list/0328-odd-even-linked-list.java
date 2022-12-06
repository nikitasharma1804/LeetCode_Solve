/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode h1=head;
        ListNode h2=head.next;
        ListNode t1=head;
        ListNode t2=head.next;
        
        while(t2!=null &&t2.next!=null){
         ListNode nt1=t1.next.next;
         ListNode  nt2=t2.next.next;   
            t1.next=nt1;
            t2.next=nt2;
            t1=nt1;
            t2=nt2;
            
        }
        
        t1.next=h2;
        return h1;
    }
}