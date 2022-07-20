public class findLoopInLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;

        var current = head;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }

    }

    public static boolean isCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }

        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode!=null && fastNode.next != null ){//when fastNode.next == null, means we are standing at last node.
            //when fastNode == null means list has ended
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            //Check after first movement as if we do not do that then, it will compare head to head and fail
            if(slowNode == fastNode){
                System.out.println("Cycle Found, Cycle Starting Point is "+fastNode.val);
                return true;
            }

        }

        System.out.println("Not Cyclic");
        return false;



    }
}
