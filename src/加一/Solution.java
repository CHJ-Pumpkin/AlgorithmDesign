package 加一;

import java.util.Arrays;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/8
 */
public class Solution {
    public int[] plusOne(int[] digits){
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        if (digits[0] == 10){
            return new int[]{1,0};
        }
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1]++;
            }else {
                break;
            }
        }
        if (digits[0] == 10){
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}
