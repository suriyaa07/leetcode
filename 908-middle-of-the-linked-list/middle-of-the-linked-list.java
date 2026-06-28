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
        ListNode node = head;
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        if(len==1) return node;
        if(len==2) return node.next;
        int half = len/2;
        boolean odd = true;
        if(len%2==0){
            odd = false;
        }
        while(half>0){
            node = node.next;
            half = half-1;
        }
        return node;
    }
}