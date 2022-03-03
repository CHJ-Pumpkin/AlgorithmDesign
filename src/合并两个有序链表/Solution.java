package 合并两个有序链表;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/3
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        // 类似归并排序中的合并过程
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            } else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        return dummyHead.next;
    }
}
