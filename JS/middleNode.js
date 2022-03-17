/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */



const middleNode = (head) => {
    let listNode = [];
    let curr = head;
    while (curr) {
        listNode.push(curr);
        curr = curr.next
    }
    const indexMedian = Math.floor(listNode.length / 2);
    //arreglo es par
    middle = listNode[indexMedian];
    return middle;

};

