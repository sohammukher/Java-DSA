//        ****
//        ***
//        **
//        *

public class ReversePyramid {

    public static void main(String[] args) {

        int numberOfRows = 5;

        for (int i = 1; i <= numberOfRows; i++) {
            //Total Prints in Each Row here is (numberOfRows - i)
            for (int j = 1; j <= numberOfRows - i ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

//Another Approach
//Run i : n to 1
//Run j : 1 to i
