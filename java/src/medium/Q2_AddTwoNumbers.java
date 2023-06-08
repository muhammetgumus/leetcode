package src.medium;

import src.common.ListNode;

public class Q2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(9);

        listNode1.next = listNode2;
        listNode2.next = null;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        // Result of 65 + 945 => 1010
        ListNode res = addTwoNumbers(listNode1, listNode3);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer res = realValue(l1) + realValue(l2);
        System.out.println(res);
        return changedRes(l1, l2);
    }

    public static int realValue(ListNode listNode) {
        int realValue = listNode.val;
        int step = 1;
        listNode = listNode.next;
        while (listNode != null) {
            realValue += (Math.pow(10, step) * (listNode.val));
            listNode = listNode.next;
            step++;
        }
        return realValue;
    }

    public static ListNode changedRes(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode intermediate = new ListNode();
        res.next = intermediate;
        res.val = (l1.val + l2.val) % 10;
        int sum = 0;
        int carry = l1.val + l2.val >= 10 ? 1 : 0;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum + carry < 10) {
                intermediate.val = sum + carry;
                carry = 0;

            } else {
                intermediate.val = (sum + carry) % 10;
                carry = 1;
            }
            sum = 0;
            intermediate.next = l1 != null || l2 != null || carry > 0 ? new ListNode() : null;
            intermediate = intermediate.next;
        }
        return res;
    }
}