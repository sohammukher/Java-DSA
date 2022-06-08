public class ReverseString {

    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GUNJA");

        int leftPointer = 0;
        int rightPointer = sb.length()-1;

        while (leftPointer < rightPointer){

            //Assigning the first and last character to Variables
            char frontChar = sb.charAt(leftPointer);
            char backChar = sb.charAt(rightPointer);

            //Switching the positions on the Above 2 Characters
            sb.setCharAt(leftPointer,backChar);
            sb.setCharAt(rightPointer,frontChar);

            //Resetting Value of the Pointers
            leftPointer++;
            rightPointer--;
        }

        System.out.println("After Reversal String is : "+sb);
    }
}
