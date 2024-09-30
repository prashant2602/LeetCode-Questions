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
    public ListNode mergeKLists(ListNode[] lists) {
        int count = lists.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<count;i++){
            ListNode itr = lists[i];
            while(itr!=null){
                arr.add(itr.val);
                itr=itr.next;
            }
        }
        if(count==0||arr.size()==0){
            return null;
        }
        Collections.sort(arr);
        ListNode head = new ListNode(arr.get(0));
        ListNode newList = head;
        for(int i=1;i<arr.size();i++){
            ListNode l = new ListNode(arr.get(i));
            newList.next = l;
            newList=newList.next;
        }
        newList.next=null;
        return head;
    }
}
