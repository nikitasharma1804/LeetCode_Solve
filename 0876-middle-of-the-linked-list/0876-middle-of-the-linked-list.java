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
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
    ListNode t1 =head;
    ListNode t2 =head.next;
        
        while(true){
            if(t2==null){
                return t1;
            }
            if(t2.next==null){
                return t1.next;
            }
            t1=t1.next;
            t2=t2.next.next;
        }
    }
}