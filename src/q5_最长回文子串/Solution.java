/**
 * @author danny
 * @create 2019-04-18 0:20
 *
 * 参考文章：https://blog.csdn.net/qq_38905818/article/details/80501632
 */
/*
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba"也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"
 */
 //从中心出发寻找回文，降低复杂度
class 最长回文字串 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1)
            return s;
        String longest = "";    //保存最长字符串
        String str = "";        
        for (int i = 0; i < len; i++) {
            str = Longest(s, i, i);     //bab型
            if (str.length() > longest.length())
                longest = str;
            str = Longest(s, i, i + 1);     //aa型
            if (str.length() > longest.length())
                longest = str;

        }
        return longest;
    }

    public String Longest(String s, int right, int left) {
        int len = s.length();
        if (len <= 1)
            return s;
        while (right >= 0 && left <= len - 1 && s.charAt(right) == s.charAt(left)) {
            right--;
            left++;
        }
        return s.substring(right + 1, left);
    }
}
