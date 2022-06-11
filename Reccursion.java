public class Reccursion {

    public static void printNumber(int n){

        //Base Case
        if(n==0){
            System.out.println("Hit Base Case");
            return;
        }

        //Work We are doing Work in Nth Step
        System.out.print(n+" ");

        //We are assuming below will work
        printNumber(n-1);
    }
    public static void main(String[] args) {
        printNumber(5);
    }
}
