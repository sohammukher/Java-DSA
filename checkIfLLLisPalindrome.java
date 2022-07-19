public class checkIfLLLisPalindrome {
    //Steps-->
    //Find Middle Element
    //Reverse Second Half of the LL
    //Have 2 Pointers, Start of First Half and Start of Second Half
    //Traverse from Both Ends to Compare
//--------------------------------------------
    public static class ListNode {
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
        //When below is the case, consider circular LL, because size starts from 1 and not 0 like Index
        //When n == SizeOfLL then basically we want to remove the head basically
        //So we return next node from the head.
        if( n == SizeOfLL ){
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
        var i = 10;

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

        System.out.println(isPallindrome(head));



    }
    //Main Function
    public static boolean isPallindrome(ListNode head){

        //If No Nodes or Only One Node Just Return True
        if(head == null || head.next == null){
//            System.out.println("List Has Either One Or No Nodes");
            return true;
        }

        ListNode middleNode = findMiddleNode(head);//Will Give Us End Element of the First Half

        ListNode startOfSecondHalf = middleNode.next;
        //Reversing the Second Half
        ListNode newHeadOfSecondHalfReversed = reverseLinkedList(startOfSecondHalf);

        //Comparing the two halves
        ListNode firstHalfStart = head;
        while (newHeadOfSecondHalfReversed != null){//No Need TO Give Condition for First Half as it will never end before the
                                          //Second Half.
            if(firstHalfStart.val != newHeadOfSecondHalfReversed.val){
                System.out.println("Value Not Matching "+firstHalfStart.val+" "+newHeadOfSecondHalfReversed.val);
                //Not A Palindrome
                return false;
            }
            //Traversing till End
            firstHalfStart = firstHalfStart.next;
            newHeadOfSecondHalfReversed = newHeadOfSecondHalfReversed.next;
        }

        //It is a Palindrome no Mismatches found
        return true;

    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            var next = current.next;

            current.next = prev;

            prev = current;

            current = next;

        }
        //Changing the Head
        head.next = null;//Might Need to change here if it does not work
        head = prev;

        return head;
    }

    private static ListNode findMiddleNode(ListNode head) {
        //Hare and Tortoise Approach
        //2 pointer Method
        var pointerSlow = head;
        var pointerFast = head;

        while (pointerFast.next != null && pointerFast.next.next != null){//It Jumps 2 Places at once so
                                                                          //Checking for Both Cases

            pointerSlow = pointerSlow.next;
            pointerFast = pointerFast.next.next;
        }

        //return middle element
        System.out.println("Middle element is "+pointerSlow.val);
        return  pointerSlow;
    }
}
