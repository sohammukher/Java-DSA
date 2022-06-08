//        ____1
//        ___2 2
//        __3 3 3
//        _4 4 4 4
//        5 5 5 5 5
public class pyramidPattern {

    public static void main(String[] args) {

        int numberOfRows = 5;

        for (int i = 1; i <= numberOfRows ; i++) {
            //Spacing
            for (int j = 1; j <= numberOfRows-i; j++) {
                System.out.print('_');
            }
            //Printing
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            //New Line
            System.out.println();
        }
    }
}
