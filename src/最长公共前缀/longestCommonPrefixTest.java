package 最长公共前缀;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/5
 */
public class longestCommonPrefixTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String longestCommonPrefix = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(longestCommonPrefix);
    }
}
