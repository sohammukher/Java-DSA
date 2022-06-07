//        12345
//        1234
//        123
//        12
//        1

public class NumberPattern2 {
    public static void main(String[] args) {

        int numberOfRows = 5;

        for (int i = numberOfRows; i >= 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
