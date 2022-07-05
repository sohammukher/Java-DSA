public class LinkedList {

    public static Node head;
    public static class Node{
        //Linked List Node Class
        String data;
        Node next;

        Node(String data){
            this.data = data;
            next = null;
        }
    }

    //add Node to Beginning
    public static void addFirst(String data){
        //Creating new node to attach in list
        Node newNode = new Node(data);

        //If this is the first Node then Set this to head and Return
        if(head == null){
            System.out.println("First Node in List Making this the head ");
            head = newNode;
            return;
        }
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
    }
    public static void addEnd(String data){
        Node newNode = new Node(data);

        //Checking if this is the first node
        if(head == null){
            System.out.println("This is the first node making it the head node");
            head = newNode;
            return;
        }

        //If This is not the First Node we need to Traverse to End and Attach it at the end
        Node currentNode = head;
        while (currentNode.next != null){

            currentNode = currentNode.next;
        }
        System.out.println("Traversed to the End Attaching this node after "+currentNode.data);
        currentNode.next = newNode;
        return;
    }

    public static void main(String[] args) {
        //Inserting at the Beginning
//        addFirst("A1");
//        addFirst("A2");
//        addFirst("A3");
//        printLL(head);

        addEnd("A1");
        addEnd("A2");
        addEnd("A3");
        printLL(head);



    }
}
