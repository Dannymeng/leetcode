package q92_反转链表II;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*

反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。

说明:
1 ≤ m ≤ n ≤ 链表长度。

示例:

输入: 1->2->3->4->5->NULL, m = 2, n = 4
输出: 1->4->3->2->5->NULL

思路:
    先定位到m (代码中的pre) 、n (代码中的end)
    然后每次将一个节点往后调整
    如上述案例
    原型： 1->2->3->4->5->NULL
    第一次：1->3->4->2->5->NULL
    第二次：1->4->3->2->5->NULL

 */ 
 
 
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode result = cur;
        ListNode pre = null;
        ListNode end = null;


        for (int i = 1; ; i++) {
            if (i == m) {
                pre = cur;
            }
            if (i == n+1) {
                end = cur;
                break;
            }
            cur = cur.next;
        }

        head = pre.next;
        ListNode temp = head;
        while (head != end) {
            head = head.next;
            temp.next = end.next;
            end.next = temp;
            pre.next = head;
            temp = head;
        }
        return result.next;
    }
    class ListNode {
        int val;
        Solution.ListNode next;
        ListNode(int x) { val = x; }
    }
}
