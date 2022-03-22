package q7_整数反转;

//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。
//假设环境不允许存储 64 位整数（有符号或无符号）。
//示例 1：
//
//输入：x = 123
//输出：321
//示例 2：
//
//输入：x = -123
//输出：-321
//示例 3：
//
//输入：x = 120
//输出：21
//示例 4：
//
//输入：x = 0
//输出：0


/***
 * 思路：
 *
 * 使用取余的方法，从后往前每一位迭代求，但是需要注意
 *  不能超出int的取值范围， -2^31 ---- 2^31-1 之间
 *  时间复杂度：O(log∣x∣)。翻转的次数即 十进制的位数。
 * 空间复杂度：O(1)。
 */
class Solution {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }


    public static int reverse(int x) {

        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int temp = x % 10;
            x /=10;
            rev = rev*10 + temp;

        }
        return rev;

    }
}


