package 加一;

import java.util.Arrays;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/8
 */
public class plusOneTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.plusOne(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(ints));
    }
}
