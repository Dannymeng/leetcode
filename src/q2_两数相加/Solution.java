package q2_两数相加;//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

//您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode _l1 = l1;
        ListNode _l2 = l2;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int temp = 0;
        while (_l1 != null || _l2 != null) {
            int i = _l1 == null ? 0 : _l1.val;
            int j = _l2 == null ? 0 : _l2.val;
            int sum = i + j + temp;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            temp = sum / 10;
            if (_l1 != null) _l1 = _l1.next;
            if (_l2 != null) _l2 = _l2.next;

        }
        if (temp != 0)
            curr.next = new ListNode(temp);
        return result.next;
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

