class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    //    public ListNode reverseList(ListNode head) {
//        ListNode x = null,y = null;
//        while (head!=null){
//            y=head.next;
//            head.next = x;
//            x = head;
//            head=y;
//        }
//        return x;
//    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
