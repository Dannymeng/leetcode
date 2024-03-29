package q132_分割回文串II;
/*
给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
返回符合要求的最少分割次数。
示例:
输入: "aab"
输出: 1
解释: 进行一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
复杂度 n^3
 */

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minCut(s));
    }

    public static int minCut(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 0;

        for (int i = 1; i < len; i++) {
            dp[i] = isPalindrome(s, 0, i) ? 0 : i;
            for (int j = i; j >= 1; j--) {
                if (isPalindrome(s, j, i)) {
                    dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                }
            }
        }
        return dp[len - 1];
    }

    //判断是否为回文数
    public static boolean isPalindrome(String s, int a, int b) {
        char[] ch = s.toCharArray();
        while (a < b) {
            if (ch[a] == ch[b]) {
                a++;
                b--;
            } else {
                return false;
            }
        }
        return true;
    }
}
