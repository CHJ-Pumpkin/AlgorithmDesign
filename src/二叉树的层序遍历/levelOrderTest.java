package 二叉树的层序遍历;

import java.util.List;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/4
 */
public class levelOrderTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> levelOrder = solution.levelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        System.out.println(levelOrder);
    }
}
