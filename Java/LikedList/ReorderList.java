//Order a LinkedList  L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]


package interview.LikedList;

/**
 *
 * @author ANA.ROSAS
 */


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
class ReorderList {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        int size = (stack.size()-1)/2;
        curr = head;
        while(size-- > 0){
            ListNode top = stack.pop();
            ListNode temp = curr.next;
            curr.next = top;
            top.next = temp;
            curr = temp;
        }
        stack.pop().next = null;
    }
    
    public void reorderList2(ListNode head) {
        if (head == null)
            return;
        Stack<ListNode> stack = new Stack<>();
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        curr = head;
        for (int i = 1; i<= stack.size()/2;i++){
            ListNode temp = curr.next;
            ListNode endNode = stack.pop();
            curr.next = endNode;
            endNode.next = temp;
            curr= temp;
        }
        curr.next = null;
    }
}