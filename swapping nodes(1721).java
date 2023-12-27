class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode last=head;
        ListNode temp=head;
        for(int i=1;i<k;i++)
            temp=temp.next;
        
        first=temp;
        while(temp.next!=null){
            temp=temp.next;
            last=last.next;
        }
        int t= first.val;
        first.val=last.val;
        last.val=t;
        return head;
    }
}