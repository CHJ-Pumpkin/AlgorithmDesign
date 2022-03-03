package 反转链表;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/3
 */
public class ListNodeTest {

    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = solution.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))));
        ValueResult(listNode);
        System.out.println(stringBuilder.toString());
    }

    static void ValueResult(ListNode result){
        if (result.next != null){
            stringBuilder.append(result.val);
            ValueResult(result.next);
        }else {
            stringBuilder.append(result.val);
        }
    }
}
