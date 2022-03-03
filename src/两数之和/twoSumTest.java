package 两数之和;

import java.util.Arrays;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/3
 */
public class twoSumTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] twoSum = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(twoSum));
    }
}
