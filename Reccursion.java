public class Reccursion {

    public static int powerFunctionLogNStackHeight(int x, int n){
        if(x == 0){
            return 0;//Base Case 1
        }
        if(n == 0){
            return 1;//Base Case 2
        }

        //if power of X is even we can split int 2
        if(n%2 == 0){
           return powerFunctionLogNStackHeight(x,n/2) * powerFunctionLogNStackHeight(x,n/2);
        }else{
            //Power of x is odd, add extra x to previous formula as in this case power can't be split into two
            return powerFunctionLogNStackHeight(x,n/2) * powerFunctionLogNStackHeight(x,n/2)*x;
        }
    }
    public static void printFibbo(int Nth, int a,int b){
        if(Nth == 0){
            System.out.println("Hit Base Case");
//            System.out.println(b);
            return;
        }
        int c = a + b;
        System.out.println(c);

        printFibbo(Nth - 1,b,c);

    }
    public static int Factorial(int currentNumber){
        if(currentNumber == 0){
            return 1;
        }

        int factorial = currentNumber * Factorial(currentNumber-1);

        System.out.println("factorial "+factorial);

        return factorial;
    }
    public static void printNSum(int sum, int currentNumber, int NthNumber){

        System.out.println("Current Number "+currentNumber);
        if(currentNumber == NthNumber){
            int localSum = sum + currentNumber;
            System.out.println(localSum);
            return;
        }

        int localSum = sum + currentNumber;
        System.out.println(localSum);

        printNSum(localSum, currentNumber+1, NthNumber);
    }
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
        //printNumber(5);
        //printNSum(0, 1, 5);

        //int factorial = Factorial(3);

       // System.out.println("Factorial Number "+ factorial);

        //printFibbo(10,0,1);
        System.out.println(powerFunctionLogNStackHeight(2,5));
    }
}
