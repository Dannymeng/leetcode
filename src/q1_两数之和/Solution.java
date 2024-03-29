package q1_两数之和;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author danny
 * @create 2019-04-25 10:46
 */
/*
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] arr = twoSum(nums, target);
        System.out.println(Arrays.toString(arr));
    }
    //时间复杂度：O（n）
    //以空间换时间
    //通过以空间换取速度的方式，我们可以将查找时间从 O(n) 降低到 O(1)。
    //哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。
    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
    
    
    //时间复杂度高 O(n^2)
//    public static int[] twoSum(int[] nums, int target) {
//
//        int len = nums.length;
//        int[] arr = new int[]{-1, -1};
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (nums[i] + nums[j] == target) {
//                    arr[0] = i;
//                    arr[1] = j;
//                }
//            }
//        }
//        return arr[0] == -1 ? null : arr;
//    }


}
