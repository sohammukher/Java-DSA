
public class ReverseLLIterative {

    static void ReverseIterative(){
        System.out.println("Reversing LL.........");
        //if Blank LL or Only one node
        if( LinkedList.head == null ||  LinkedList.head.next == null){
            System.out.println("Blank LL or Only one node");
            return;
        }

        //Assigning 2 Nodes Prev, Current
        LinkedList.Node previous  = LinkedList.head;
        LinkedList.Node current  = LinkedList.head.next;

        while (current != null){
            //Saving the next node of current so that it is not lost
            LinkedList.Node next = current.next;

            //Changing the Pointing of the current node backwards
            current.next = previous;

            //Moving the Block Forward by one block
            previous = current;
            current = next;

        }
        //VV IMPORTANT at this point head is still at the beginning, so if we don't make head.next = null
        //then this will keep on looping, as LAST NODE SHOULD ALWAYS POINT TO NULL, ELSE LAST NODE WILL POINT
        //SECOND LAST NODE Always
        LinkedList.head.next = null;

        //New Head of the LL, has been Assigned, Do not Assign Current here as at this point current is NULL
        LinkedList.head = previous;
        System.out.println("NEW HEAD IS "+previous.data);
        System.out.println("Next Node of Head is "+previous.next.data);

        System.out.println("LL has Been Reversed.....");

    }
    public static void main(String[] args) {
        LinkedList.addEnd("S");
        LinkedList.addEnd("O");
        LinkedList.addEnd("H");
        LinkedList.addEnd("A");
        LinkedList.addEnd("M");

        ReverseIterative();

        System.out.println("HEAD IS "+ LinkedList.head.data );

        //Printing LL
        while ( LinkedList.head != null){
            System.out.println("VALUE "+ LinkedList.head.data );
            LinkedList.head =  LinkedList.head.next;
        }
    }
}
