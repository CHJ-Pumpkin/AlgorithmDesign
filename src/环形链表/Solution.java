package 环形链表;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/4
 */
public class Solution {
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }
        }
        return false;
    }
}
