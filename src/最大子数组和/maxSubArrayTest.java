package 最大子数组和;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/3
 */
public class maxSubArrayTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,10};
        int subArray = solution.maxSubArray(nums);
        System.out.println(subArray);
    }
}
