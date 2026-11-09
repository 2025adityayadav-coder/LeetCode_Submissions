// 237. Delete Node in a Linked List (Medium) | Topics: Linked List
// Approach: We cannot reach the previous node, so we copy the next node's value into the
//           given node and then unlink the next node. The node's *value* is removed from the list.
// Time: O(1) | Space: O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
