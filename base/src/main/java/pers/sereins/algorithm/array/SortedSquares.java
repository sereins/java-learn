package pers.sereins.algorithm.array;

import java.util.Arrays;

/**
 * 有序的平方
 */
public class SortedSquares {

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        SortedSquares sortedSquares = new SortedSquares();

        int[] ints = sortedSquares.sortedSquares(nums);

        System.out.println(Arrays.toString(ints));
    }

    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];
        int index = result.length - 1;


        while (left <= right) {

            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }
}
