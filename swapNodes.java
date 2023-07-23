// Question 11: Swap Nodes in Pairs

// Skill Mapping: Basic

// Description: Solve the LeetCode Problem given as a link below -

// https://leetcode.com/problems/swap-nodes-in-pairs/
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
class swapNodes {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode temp=head;
        head=temp.next;
        while(temp!=null && temp.next!=null)
        {
             ListNode temp1=temp.next;
             temp.next=temp1.next;
             temp1.next=temp;
             if(prev!=null) prev.next=temp1;
             prev=temp;
             temp=temp.next;

        }
        
        return head;
        
    }
}
