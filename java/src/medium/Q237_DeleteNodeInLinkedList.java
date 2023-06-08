package src.medium;

public class Q237_DeleteNodeInLinkedList {
    public static void main(String[] args) {
        ListNode head =  new ListNode(4);
        ListNode node1 =  new ListNode(5);
        ListNode node2 =  new ListNode(1);
        ListNode node3 =  new ListNode(9);

        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=null;

        deleteNode(node1);

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static void deleteNode(ListNode node) {
        node.val= node.next.val;
        node.next= node.next.next;
    }

    static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

}
