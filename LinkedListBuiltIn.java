import java.util.LinkedList;

public class LinkedListBuiltIn {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList ();

        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("Linked List");

        //Add is same as add last
        list.add("SOHAM");
        System.out.println(list);

        //Printing the Linked List
        printLinkedList(list);

        //Removing elements
        list.removeFirst();
        list.removeLast();
        //Removing at a Specific Index
        int INDEX_TO_REMOVE_VALUE_FROM = 1;
        list.remove(INDEX_TO_REMOVE_VALUE_FROM);
    }

    private static void printLinkedList(LinkedList<String> list) {
        //Print One By One
        System.out.println("Printing One by One");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    }
}
