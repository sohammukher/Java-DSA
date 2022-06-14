public class removeDuplicates {
    public static boolean allAlphabetIndexMap[] = new boolean[26];//We have 26 total Alphabets so we
    public static String removedDuplicacy = "";

    public static void removeDuplicateChar(String str){
        //Base case
        if(str.length() == 0){
            System.out.println("Hit base Case, returning the proper string without duplicates");
            System.out.println(removedDuplicacy);
            return;
        }

//       str.charAt(0) - 'a' ---> gives the index where the respective value for the character is stored
        //for the character at str.charAt(0)
        //a - a == 0, b - a = 1..........and so on
        if(allAlphabetIndexMap[str.charAt(0) - 'a'] == false){
            System.out.println("First Entry of "+str.charAt(0));
            allAlphabetIndexMap[str.charAt(0) - 'a'] = true;
            removedDuplicacy += str.charAt(0);

        }else{
            System.out.println("Duplicate Entry of "+str.charAt(0));
            System.out.println("Don't need to do anything we don't need this in our final string");
        }

        //Making recursive call
        removeDuplicateChar(str.substring(1));

    }

    public static void main(String[] args) {

        removeDuplicateChar("aaabbccddmmaa");
    }

}
