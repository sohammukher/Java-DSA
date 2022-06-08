//        *______*
//        **____**
//        ***__***
//        ********
//        ********
//        ***__***
//        **____**
//        *______*
public class ButterflyPattern {
    public static void main(String[] args) {


        int halfNUmberOfRows = 4;
        //Printing Top Half
        for (int i = 1; i <= halfNUmberOfRows; i++) {
            //Print For the Left Side Of the Stars
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            //Loop for Printing Spaces
            for (int j = 1; j <= 2*(halfNUmberOfRows - i) ; j++) {
                System.out.print('_');
            }
            //Print For the Right Side Of the Stars
            for (int j = 1; j <=i ; j++) {
                System.out.print('*');
            }
            //Move to New Line
            System.out.println();
        }

        //Printing Bottom Half

        for (int i = halfNUmberOfRows; i > 0; i--) {
            //Print For the Left Side Of the Stars
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            //Loop for Printing Spaces
            for (int j = 1; j <= 2*(halfNUmberOfRows - i) ; j++) {
                System.out.print('_');
            }
            //Print For the Right Side Of the Stars
            for (int j = 1; j <=i ; j++) {
                System.out.print('*');
            }
            //Move to New Line
            System.out.println();
        }
    }
}
