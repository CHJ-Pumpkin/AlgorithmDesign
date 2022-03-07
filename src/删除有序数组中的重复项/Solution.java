package 删除有序数组中的重复项;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/7
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        // 使用双指针
        if (nums == null){
            return 0;
        }else if (nums.length == 1){
            return nums.length;
        }

        int i = 0,j =1;
        while(j<nums.length){
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
