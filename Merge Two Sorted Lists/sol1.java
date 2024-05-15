class Solution{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                curr.next=list2;
                list2=list2.next;
            }
            else{
                curr.next=list1;
                list1=list1.next;
            }
            curr=curr.next;
        }
        ListNode node = new ListNode();
        if(list1!=null){
            node=list1;
        }
        else{
            node=list2;
        }
        curr.next=node;
        return head.next;
    }
}
