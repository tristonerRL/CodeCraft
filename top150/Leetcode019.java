class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //使用快慢指针，略
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        while(i < n && fast != null) {
            fast = fast.next;
            i++;
        }
        if(fast == null) {
            return (i < n) ? null : head.next;
        }
        ListNode slowslow = null;
        while(fast != null) {
            fast = fast.next;
            slowslow = slow;
            slow = slow.next;
        }
        slowslow.next = slowslow.next.next;
        return head;
    }
}
