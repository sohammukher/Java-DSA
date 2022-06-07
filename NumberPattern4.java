//        1
//        01
//        010
//        1010
//        10101
public class NumberPattern4 {
    public static void main(String[] args) {


        int numberOfRows = 5;
        //Take a random number to print
        int numberToPrint = 1;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                //Printing Modulo of 2, it gives us Binary Pattern for the Number we took
                System.out.print(numberToPrint%2);
                //Increment the number we took
                numberToPrint++;

            }
            System.out.println();
        }
    }
}
