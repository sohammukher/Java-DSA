public class FindandDeleteNthNode{
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }

        //If Only One Node in the LL evaluating
        if(head.next == null && n != 1){
            //If Only one Node in the Linked List and we need to Remove index other than 1
            return head;
        } else if (head.next == null && n == 1) {
            //If Only one Node in the Linked List, and we need to Remove at 1st Index
            return null;

        }

        //Calculating Size of Linked List
        int SizeOfLL = 0;
        ListNode current = head;

        while (current!= null){
            SizeOfLL++;
            current = current.next;
        }
        //If n == SizeOfLL then Return Next of Head
        if( n ==SizeOfLL ){
            return head.next;
        }
        //Calculating nth from the End will with which index from the Start
        int indexAtWhichToRemoveFromStart = SizeOfLL - n ;

        //Traversing to the Index From which we need to Delete
        ListNode previousNodeOfNodeToDelete = head;
        for (int i = 1; i < indexAtWhichToRemoveFromStart; i++) {

            previousNodeOfNodeToDelete = previousNodeOfNodeToDelete.next;
        }

        //At This Point variable "previousNodeOfNodeToDelete", is pointing to the
        //Node One Node Before the Node we Want To Delete

        //Just Skipping Our Target Node
        previousNodeOfNodeToDelete.next = previousNodeOfNodeToDelete.next.next;

        return head;

    }

    public static void main(String[] args) {

    }




}