package 有效的括号;

import java.util.Stack;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/5
 */
public class Solution {
    public boolean isValid(String s) {
        int len = s.length()/2;
        for (int i = 0; i < len; i++) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.equals("");
    }

    public boolean isValidOptimize(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='(')stack.push(')');
            else if (c=='{')stack.push('}');
            else if (c=='[')stack.push(']');
            else if (stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}
