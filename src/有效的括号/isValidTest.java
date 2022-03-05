package 有效的括号;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/5
 */
public class isValidTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        boolean valid = solution.isValid("(([]){})");
//        System.out.println(valid);

        boolean validOptimize = solution.isValidOptimize("[");
        System.out.println(validOptimize);
    }
}
