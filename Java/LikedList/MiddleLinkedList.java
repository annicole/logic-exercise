/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }


Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
 

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

 */
class Solution {
    
    ArrayList <ListNode> listNode = new ArrayList<>();
    public ListNode middleNode(ListNode head) {
    ListNode middle = null;
    getLinkedSize(head);
    int indexMedian =  listNode.size()/2;
    System.out.println("Size indexMedian " + indexMedian);
    middle = listNode.get(indexMedian);
        return middle;
    }
    
    public void getLinkedSize(ListNode node){
        if(node != null){
            listNode.add(node);
            getLinkedSize(node.next);
        }
    }

     public ListNode middleNode2(ListNode head) {
        ListNode temp = head;        
        int length = 0;
        while (temp != null)
        {
            length++;
            temp = temp.next;
        }
        
        temp = head;
        for (int i = 0; i < length / 2; i++)
        {
            temp = temp.next;
        }
        
        return temp;
    }
}