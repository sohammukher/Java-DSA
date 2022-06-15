public class printPurmutationsApnaCollegeSolution {

    public static void printPermutaions(String str,  String newPermuation){
        //System.out.println("Function Started newString Combination Generated "+newPermuation+" Original String current condition"+str);
        if(str.length() == 0 ){
            System.out.println(newPermuation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            //Create a New String which Does not have the current character and pass it to next function call
            //VERY IMPORTANT REMEMBER BELOW
            String newString = str.substring(0,i) +//Takes String Before current Character
                    str.substring(i+1);//Takes String After Current Character
            printPermutaions(newString, newPermuation+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        printPermutaions("abc","");//TOTAL NUMBER OF CHARACTERS == (number of characters)! or n!
    }
}
