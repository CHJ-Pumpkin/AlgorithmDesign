package 子数组范围和;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/4
 */
public class Solution {
    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        int max;
        int min;
        long res = 0;
        for (int i = 0; i < len; i++) {
            max = nums[i];
            min = nums[i];

            for (int j = i+1; j < len; j++) {
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
                res += (max-min);
            }
        }
        return res;
    }
}
