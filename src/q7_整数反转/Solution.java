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


class Solution {


    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        if (x == 0)
            return 0;
        String str = String.valueOf(x);
        char[] str_ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(str.charAt(0)=='-'){
            StringBuilder str1 = new StringBuilder(str.substring(1,str.length())).reverse();
            sb.append("-").append(str1);
        }else{
            sb.append(str.substring(0,str.length())).reverse();
        }
        try{
            return Integer.parseInt(sb+"");
        }catch(Exception e){
            return 0;
        }
    }

    public static int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
