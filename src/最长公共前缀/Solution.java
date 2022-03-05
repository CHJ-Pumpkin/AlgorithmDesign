package 最长公共前缀;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/5
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String str = strs[0];
        for (String string : strs) {
            while (!string.startsWith(str)) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}
