public class StackUsingLL {

    //Class for Linked List Node
    static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    //Class for Stack implementation
    static class StackLL{
        //Declare Separate Head for our Stack
        private static Node head;

        public static boolean isEmpty(){
            //Returns the Below Statement as True or False
            return head == null;
        }
        public void push(int data){
            var newNode = new Node(data);

            if(isEmpty()){
                System.out.println("Creating First Node in Stack");
                head = newNode;
                System.out.println("Pushed "+head.data+" Successfully ");
                return;
            }
            //Inserting at Beginning of the Linked List
            newNode.next = head;
            head = newNode;
            System.out.println("Pushed "+head.data+" Successfully ");
        }

        public int pop(){
            //Basically removing from the Head of the LL
            if(isEmpty()){
                System.out.println("Nothing to Pop, Empty Stack Returning -1");
                return -1;
            }
            int previousTop = head.data;
            System.out.println("Popped "+ previousTop);

            head = head.next;


            //Returning the Previous top or the Element We just Popper
            return previousTop;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Stack Nothing at the Top");
                return -1;
            }

            int topOfStack = head.data;

            System.out.println("Top Element is "+topOfStack);

            return topOfStack;


        }

    }

    public static void main(String[] args) {
        var newStack = new StackLL();

        //Inserting Elements in the Stack
        for (int i = 0; i < 4; i++) {
            newStack.push(i);
        }

        //Popping Each Element Till Stack is Empty
        while (newStack.isEmpty() == false){
            newStack.pop();
        }
    }
}
