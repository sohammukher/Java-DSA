//        ___*
//        __***
//        _*****
//        *******
//        _*****
//        __***
//        ___*

public class StarDiamondPattern {
    public static void main(String[] args) {

        //REMEMBER: At Any Point Number of * printer is (2*i - 1)

        int numberOfRows = 4;
        //Printing First Half Of the Triangle
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j <= numberOfRows-i ; j++) {
                System.out.print("_");
            }
            //Printing Stars
            for (int j = 1; j <= (2*i - 1) ; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        //Printing Second Half Of the Triangle
        for (int i = numberOfRows; i >= 1; i--) {
            for (int j = 1; j <= numberOfRows-i  ; j++) {
                System.out.print("_");
            }
            //Printing Stars
            for (int j = 1; j <= (2*i - 1) ; j++) {

                System.out.print("*");

            }

            System.out.println();

        }
    }
}
