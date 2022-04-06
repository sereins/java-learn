package pers.sereins.algorithm.array;

/**
 * 数据最小长度
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */

public class MinSubArrayLen {
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        MinSubArrayLen minSubArrayLen = new MinSubArrayLen();

        int i = minSubArrayLen.minSubArrayLen(nums, target);

        System.out.println(i);

    }

    public int minSubArrayLen(int[] nums, int target) {

        int left = 0;
        int result = Integer.MAX_VALUE;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
