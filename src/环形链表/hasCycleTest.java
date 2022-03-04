package 环形链表;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/4
 */
public class hasCycleTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        环形链表
        ListNode listNode = new ListNode(2).next = new ListNode(0).next = new ListNode(-4);
        boolean b = solution.hasCycle(new ListNode(3).next = listNode.next = listNode);
        System.out.println(b);
    }
}
