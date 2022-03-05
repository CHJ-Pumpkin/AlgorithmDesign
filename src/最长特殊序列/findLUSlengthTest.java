package 最长特殊序列;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/5
 */
public class findLUSlengthTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int luSlength = solution.findLUSlength("aba", "cdc");
        System.out.println(luSlength);
    }
}
