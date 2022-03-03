package 合并两个有序链表;

import java.util.ArrayList;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/3
 */
public class mergeTwoListsTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode mergeTwoLists = solution.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))));
        ArrayList<Integer> list = new ArrayList<>();
        while (mergeTwoLists.next !=null){
            list.add(mergeTwoLists.val);
            mergeTwoLists = mergeTwoLists.next;
        }
        list.add(mergeTwoLists.val);
        System.out.println(list);
    }
}
