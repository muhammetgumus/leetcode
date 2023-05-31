package src;

public class Q19_RemoveNthNodeFromEndOfLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        head = removeNthFromEnd(head, 3);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        if (head.next == null) {
            return null;
        }

        int l = 0;
        ListNode resp = dummy;

        while (resp.next != null) {
            l++;
            resp = resp.next;
        }

        l -= n;
        resp = dummy;

        while (l > 0) {
            l--;
            resp = resp.next;
        }

        resp.next = resp.next.next;
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {this.val = val;}

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
