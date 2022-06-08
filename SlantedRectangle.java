//        ____*****
//        ___*****
//        __*****
//        _*****
//        *****

public class SlantedRectangle {

    public static void main(String[] args) {


        int numberOfRows = 5;

        for (int i = 1; i <= numberOfRows; i++) {

            //For Spacing
            for (int j = 1; j <=numberOfRows-i ; j++) {
                System.out.print("_");
            }
            //For Printing Pattern
            for (int j = 1; j <= numberOfRows ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
