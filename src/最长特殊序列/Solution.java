package 最长特殊序列;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/5
 */
public class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        int m = a.length(), n = b.length();
        return Math.max(m, n);
    }
}
