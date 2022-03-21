package q3_无重复字符的子长字串;

import java.util.TreeSet;

/**
 * @author danny
 * @create 2019-04-25 23:59
 */
//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
// 输入: "abcabcbb"
//输出: 3

//方法：使用滑动窗口

class Solution {
      public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        TreeSet<Character> set = new TreeSet<>();
        int i = 0, j = 0;
        int max = 0;
        while (i < len && j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

}
