package q82_删除排序链表中的重复元素II;

/*
给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。

示例 1:

输入: 1->2->3->3->4->4->5
输出: 1->2->5

思路：使用LinkedHashMap保存<k , 次数>
*/


import java.util.LinkedHashMap;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode l1 = new ListNode(0);
        ListNode temp = l1;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while (head != null) {
            if (map.containsKey(head.val)) {
                int i = map.get(head.val);
                map.put(head.val, i+1);
            } else {
                map.put(head.val, 1);
            }
            head = head.next;
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                temp.next = new ListNode(i);
                temp = temp.next;
            }
        }
        return l1.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


