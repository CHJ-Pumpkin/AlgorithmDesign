package 各位相加;

import java.util.Arrays;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/3
 */
public class Solution {
    public int addDigits(int num){
        String nums = String.valueOf(num);
        return Add(nums);

//        大神的代码
//        return (num-1)%9+1;
    }

    static int Add(String nums){
        int res = 0;
        for (int i = 0; i < nums.length(); i++) {
            res += Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        if (res>=10){
            res = Add(String.valueOf(res));
        }
        return res;
    }
}
