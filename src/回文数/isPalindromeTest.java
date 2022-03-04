package 回文数;

import java.util.Date;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/4
 */
public class isPalindromeTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        long start = System.nanoTime();
        boolean palindrome = solution.isPalindrome(-121);
        long end = System.nanoTime();
        System.out.println(palindrome);
        System.out.println("palindrome Time: "+(end-start));

        System.out.println("-------------------------------------------");

        long start2 = System.nanoTime();
        boolean palindromeOptimize = solution.isPalindromeOptimize(-121);
        long end2 = System.nanoTime();
        System.out.println(palindromeOptimize);
        System.out.println("palindromeOptimize Time: "+(end2-start2));
    }
}
