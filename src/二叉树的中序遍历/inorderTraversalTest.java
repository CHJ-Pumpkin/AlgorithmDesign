package 二叉树的中序遍历;

import java.util.List;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/4
 */
public class inorderTraversalTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> inorderTraversal = solution.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
        System.out.println(inorderTraversal);
    }
}
