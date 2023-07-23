// Question 12: Reverse Nodes in k-Group

// Skill Mapping: Basic

// Description: Solve the LeetCode Problem given as a link below -

// https://leetcode.com/problems/reverse-nodes-in-k-group/
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
class reverseNodes{
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int num=0;
        while(temp!=null && num!=k){
            temp=temp.next;
            num++;
        }
        if(num==k)
        {
            temp=reverseKGroup(temp,k);
            while(num-- >0)
            {
                ListNode temp1=head.next;
                head.next=temp;
                temp=head;
                head=temp1;
            }
            head=temp;
        }
        return head;
    }
}
