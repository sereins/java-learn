package pers.sereins.algorithm.array;

/**
 * 移除元素
 */
public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement removeElement = new RemoveElement();

        // 双循环解决
        int r1 = removeElement.removeElement(nums, val);
        System.out.println("两次循环: " + r1);

        // 同向双指针
        int r2 = removeElement.removeElement1(nums, val);
        System.out.println("双指针: " + r2);

    }

    public int removeElement(int[] nums, int val) {

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                // 整体相后移动一位
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }

    public int removeElement1(int[] nums, int val) {
        int slowIndex = 0, fastIndex = 0;
        int size = nums.length;

        while (fastIndex < size) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
            fastIndex++;
        }
        return slowIndex;
    }
}
