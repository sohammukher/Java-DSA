import java.util.ArrayList;

public class StackUsingArrayList {

    public static class Stack{
        //Defining an ArrayList to Hold Data Internally
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
//            Returns True for Empty List
            return list.isEmpty();
        }

        public void push(int elementToPush){
            list.add(0,elementToPush);
            System.out.println("Pushed "+elementToPush);
        }

        public void pop(){
            int top = list.remove(0);
            System.out.println("Popped "+top);
        }
        public void printStack(){
            System.out.println(list.toString());
        }
    }
    public static void main(String[] args) {

        //New Stack Instance
        var stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.printStack();

        for (int i = 0; i < 10; i++) {
            stack.pop();
        }

    }
}
