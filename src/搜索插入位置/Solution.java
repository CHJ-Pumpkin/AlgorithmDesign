package 搜索插入位置;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/7
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
