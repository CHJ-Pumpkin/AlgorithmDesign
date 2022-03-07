package 移除元素;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/7
 */
public class removeElementTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {3, 2, 2, 3};
        int removeElement = solution.removeElement(ints, 3);
        System.out.println(removeElement);
        for (int i = 0; i < removeElement; i++) {
            System.out.println(ints[i]);
        }
    }
}
