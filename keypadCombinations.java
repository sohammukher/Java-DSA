public class keypadCombinations {
    public static String keypad[]={
            ".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
    };

    public static void printCombinations(String numberDialed, int Index, String finalCombination){

        if(Index == numberDialed.length()){
            System.out.println(finalCombination);
            return;
        }

        //Get Current Character ie Number Dialed like 1, 2 etc.
        char currentCharacter = numberDialed.charAt(Index);

        //Get possible value at current number dialed
        String mappingForCurrentDigit = keypad[currentCharacter - '0'];//will give us Index relevant to current Number

        //Call the recursive function for each choice we have, for that number
        for (int i = 0; i < mappingForCurrentDigit.length(); i++) {
            char characterForReccursiveCall  =  mappingForCurrentDigit.charAt(i);
            printCombinations(numberDialed,Index+1,finalCombination+characterForReccursiveCall);
        }
    }
    public static void main(String[] args) {
        printCombinations("23",0,"");
    }
}
