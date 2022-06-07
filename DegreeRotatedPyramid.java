public class DegreeRotatedPyramid {

    public static void main(String[] args) {
        //Here We need 3 Loops to Print The Pattern

        int numberOfRows = 5;

        for (int i = 1; i <= numberOfRows; i++) {
            //to Print Spaces
            for (int j = 1; j <= (numberOfRows-i) ; j++) {
                System.out.print(' ');
            }
            //To Print Actual Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //New Line
            System.out.println();
        }
    }
}
