package 两数之和;

import java.util.HashMap;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/3
 */
public class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] ints = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                ints[0] = hashMap.get(nums[i]);
                ints[1] = i;
                return ints;
            }
            hashMap.put(target-nums[i],i);
        }
        return ints;
    }
}
