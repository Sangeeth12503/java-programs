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
    public ListNode rotateRight(ListNode head, int k) {
       ListNode temp = head;
       if(head==null||k==0){
           return head;
       }
       int len=1;
       while(temp.next!=null){
           temp=temp.next;
           len++;
       }
       temp.next=head;
       k=k%len;
       int r=len-k;
       int i=1;
       temp=head;
       while(i<r){
           temp=temp.next;
           i++;
       }
       head=temp.next;
       temp.next=null;
       return head;
    }
    
}