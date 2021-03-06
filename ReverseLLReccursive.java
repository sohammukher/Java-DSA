public class ReverseLLReccursive {
    public static Node head;
    public static int sizeOfLL = 0;

    public static class Node{
        //Linked List Node Class
        String data;
        Node next;

        Node(String data){
            this.data = data;
            next = null;
        }
    }
    public static void deleteStart(){
        //If No nodes return
        if(head == null){
            System.out.println("No nodes in the list");
            return;
        }
        System.out.println("Decreasing size of LL");
        sizeOfLL--;
        head = head.next;
        return;

    }

    public static void deleteLast(){
        if(head == null){
            System.out.println("No Nodes are Present");
            return;
        }

        System.out.println("Decreasing size of LL");
        sizeOfLL--;

        if(head.next == null){
            System.out.println("Only One Node Present That is Head, Making it null");
            head = null;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        System.out.println("Moving To the Second Last node");
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        System.out.println("Reached Last Node to Delete "+lastNode.data);

        System.out.println("Disconnecting Last Node From the LL");
        secondLastNode.next = null;
        System.out.println("Deleted Last Node Successfully, now secondLastNode is pointing to null");


    }
    //add Node to Beginning
    public static void addFirst(String data){
        //Creating new node to attach in list
       Node newNode = new Node(data);

        //If this is the first Node then Set this to head and Return
        if(head == null){
            System.out.println("First Node in List Making this the head ");
            //Increasing Size of LL
            sizeOfLL++;
            head = newNode;
            return;
        }
        System.out.println("Increasing size of LL");
        sizeOfLL++;
        //Making Next Of New Node to Next
        newNode.next = head;
        //Making New Node the head as we are inserting in start
        head = newNode;
    }

    public static void printLL(Node head){
        //Check if no nodes then return
        if(head == null){
            System.out.println("NO nodes in the List Need can't Print");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void addEnd(String data){
        Node newNode = new Node(data);

        //Checking if this is the first node
        if(head == null){
            System.out.println("This is the first node making it the head node");
            //Increasing Size of LL
            sizeOfLL++;
            head = newNode;
            return;
        }

        System.out.println("Increasing Size of the List");
        sizeOfLL++;
        //If This is not the First Node we need to Traverse to End and Attach it at the end
        Node currentNode = head;
        while (currentNode.next != null){

            currentNode = currentNode.next;
        }
        System.out.println("Traversed to the End Attaching this node after "+currentNode.data);
        currentNode.next = newNode;
        return;
    }
    //REVERSE FUNCTION
    public static Node ReverseLLRecursive(Node head){
        printLL(head);

        if(head == null || head.next == null){
            System.out.println("Either Empty LL or Only One Node, BASE CASE HIT");
            System.out.println("returning, LL has BEEN REVERSED");
            return head;
        }


        //Getting Previously Reversed LL, Assumption
        Node newHead = ReverseLLRecursive(head.next);

        //**Remember Here head is the current node

        //Making Next Node of Current Node Point to Current Node
        head.next.next = head;
        //Making Current Node Point to null, i.e. breaking the connection of current node with current.next
        //Because it is the last node of our reversed LL, it has to point to NULL
        head.next = null;

        //Returning the Head of the Reversed List, as our List is reversed, that will be the head of the whole list
        return newHead;
    }

    public static void printSizeOfLL(){
        System.out.println("Size of Linked List is: "+sizeOfLL);
    }
    public static void main(String[] args) {

        addEnd("S");
        addEnd("O");
        addEnd("H");
        addEnd("A");
        addEnd("M");
        printLL(head);

        System.out.println("PRINTING REVERSED LL");
        printLL(ReverseLLRecursive(head));



    }

}
