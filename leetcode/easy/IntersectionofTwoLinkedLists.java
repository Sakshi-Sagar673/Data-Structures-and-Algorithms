//Iterative approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        
        while(temp1!=null)
        {
            ListNode temp2=headB;
            while(temp2!=null)
            {
                if(temp1==temp2)
                {
                    return temp1;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
      return null;  
    }
}
//Using HashSet
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> node=new HashSet<>();
        while(headA!=null)
        {
            node.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(node.contains(headB))
            {
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
//Optimized approach
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        {
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b)
        {
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
}
