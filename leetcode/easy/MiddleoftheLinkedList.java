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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
}

//Alternate Solution

class Solution {
    public ListNode middleNode(ListNode head) {
        int l=0,c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            l=l+1;
            temp=temp.next;
        }
        temp=head;
        while(c<l/2)
        {
            temp=temp.next;
            c=c+1;
        }
        return temp;
    }
}
