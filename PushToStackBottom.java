import java.util.Stack;

public class PushToStackBottom {

    public static void PushToStackBottomRecursion(Stack<Integer> stack, int elementToPush){
        //When Stack Completely Empty Insert The Element you want to insert in the End.
        if(stack.isEmpty()){
            System.out.println("Reached The Bottom, Pushing The element "+elementToPush+" to end ");
            stack.push(elementToPush);
            return;
        }

        //Popping Element in current Iteration
        int elementPopped = stack.pop();

        //Calling The Function For Rest Of the Stack
        PushToStackBottomRecursion(stack,elementToPush);

        //Expecting Previous Iterations have Filled the Stack Correctly, Replace Current Element
        stack.push(elementPopped);

    }

    public static void reverseStack(Stack<Integer> stack){
        if (stack.isEmpty()){
            System.out.println("Stack Is Empty Return");
            return;
        }
//        Pop Current Element of The Stack, ie Top
        int top = stack.pop();

        //Reverse the Stack with Recursion
        reverseStack(stack);

        //Push the Top to Bottom of the Stack to reverse, IMPORTANT STEP
        PushToStackBottomRecursion(stack,top);

    }
    public static void main(String[] args) {

        Stack<Integer>  stack = new Stack<>();

        //Pushing Elements Inside the Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

//        System.out.println("Stack Before Inserting At Bottom "+stack.toString());
//
//        PushToStackBottomRecursion(stack,44);
//
//        System.out.println("Stack After Inserting At Bottom "+stack.toString());

        System.out.println("Stack Before REVERSAL "+stack.toString());
        reverseStack(stack);
        System.out.println("Stack After REVERSAL "+stack.toString());


    }
}
