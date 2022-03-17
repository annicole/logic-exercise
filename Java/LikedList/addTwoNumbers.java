/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.LikedList;

/**
 *
 * @author ANA.ROSAS
 */

 /*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

 */
public class addTwoNumbers {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    
    ListNode l3 = addTwoNumbers(l1,l2);
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode resulNode;
    int  num1 = reverseNum(Integer.valueOf(returnNum(l1)));
    int num2 = reverseNum(Integer.valueOf(returnNum(l2)));
    int res = num1 + num2;
    resulNode = getNode(res, new ListNode((0)));
    return resulNode;
  }

  public static ListNode getNode(int res, ListNode node) {
    int last = 0;
    if (res != 0) {
      last = res % 10;
      node = new ListNode(last);
      res = res / 10;
      node.next = getNode(res, node);
    }
    return node;
  }

  public static String returnNum(ListNode node) {
    String aux = "";
    if (node != null) {
      aux = String.valueOf(node.val).concat((returnNum(node.next)));
    }
    return aux;
  }

  public static int reverseNum(int num) {
    int numReverse = 0, aux = num, last = 0;
    while (aux > 0) {
      //get last digit
      last = aux % 10;
      numReverse = (numReverse * 10) + last;
      aux = aux / 10;
    }
    return numReverse;
  }
  
  
 public static ListNode addTwoNumbers2(ListNode l1, ListNode l2){
   ListNode result = new ListNode(0);
   ListNode p = l1,q= l2, curr = result;
   
   int carry = 0;
   while (p != null || q != null) {
     int x = (p!= null) ? p.val : 0;
     int y = (q!= null) ? q.val : 0;
     int sum = carry + x +y;
     curr.next = new ListNode(sum%10);
     curr = curr.next;
     if(p != null) p = p.next;
     if(q!= null ) q = q.next;
   }
   
   if(carry > 0){
     curr.next = new ListNode(carry);
   }
   return result;
 }
}
