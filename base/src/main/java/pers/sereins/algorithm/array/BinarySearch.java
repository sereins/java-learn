package pers.sereins.algorithm.array;

public class BinarySearch {

    public static void main(String[] args) {

        // 数组
        int[] nums = {0,-1,2,3,4,9,12,54,90};
        // 需要查找的值
        int target = 54;

        BinarySearch binarySearch = new BinarySearch();

        int search = binarySearch.search(nums,target);

        System.out.println("下标位置["+search+"]");

    }

    public int search(int[] nums,int target ){

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int middle = left + ( ( right - left) / 2 );

            if (nums[middle] > target)
                right = middle -1;
            else if (nums[middle] < target)
                left = middle + 1;
            else
                return middle;
        }

        return  -1;
    }
}
