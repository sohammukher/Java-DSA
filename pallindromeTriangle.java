//        ____1
//        ___212
//        __32123
//        _4321234
//        543212345
public class pallindromeTriangle {

    public static void main(String[] args) {


        int rowNum = 5;

        int beginningOfRow = 1;//Defines the First Element of Each Row

        for (int i = 1; i <= rowNum; i++) {

            //For Spaces
            for (int j = 1; j <= rowNum-i ; j++) {
                System.out.print("_");
            }
            //For First Half of the Triangle till 1, ie the middle of the Triangle
            //Run the Print Loop From the Beginning Element we Defined Above till it is 1
            for (int j = beginningOfRow; j >=1 ; j--) {
                System.out.print(j+"");
            }
            //For Second Half of the Triangle After 1, ie the middle of the Triangle
            for (int j = 2; j <= beginningOfRow; j++) {
                System.out.print(j);
            }
            //Incrementing the Beginning Element Of the Triangle
            beginningOfRow++;
            System.out.println();
        }
        
        
        
        
        
        

    }






}
