class DiamondShapeWithNumbers {
    public static void main(String[] args) {

        int numberOfRows = 5;
        //FirstHalf
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

        //Second Half
        numberOfRows = 5;

        for (int i = numberOfRows; i >= 1 ; i--) {
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
