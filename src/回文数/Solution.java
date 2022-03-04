package 回文数;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/4
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            sb.append(value.charAt(i));
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    //优化后的，执行时间更短
    public boolean isPalindromeOptimize(int x){
        if(x<0)
            return false;
        int rem,y=0;
        int quo=x;
        while(quo!=0){
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
        return y==x;
    }
}
