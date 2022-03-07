package 删除有序数组中的重复项;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/7
 */
public class removeDuplicatesTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int removeDuplicates = solution.removeDuplicates(new int[]{1,1,2});
//        int removeDuplicates = solution.removeDuplicates(null);
        System.out.println(removeDuplicates);
    }
}
