//Will Print Star Hollow Star Pattern on Dimension 5 * 5
//        *****
//        *   *
//        *   *
//        *   *
//        *****

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gridLimit = sc.nextInt();

        System.out.println("Will Print Star Hollow Star Pattern on Dimension "+gridLimit+" * "+gridLimit);
        for (int i = 1; i <= gridLimit; i++) {
            for (int j = 1; j <= gridLimit; j++) {
                //When either (i = 1 or gridLimit) or (j = 1 or gridLimit) then
                //We are at border of the Square.
                if(i == 1 || i == gridLimit || j== 1 || j == gridLimit ){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            //Printed one row, now next line
            System.out.println();
        }
    }
}
