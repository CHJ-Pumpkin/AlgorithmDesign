package 最后一个单词的长度;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/7
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
