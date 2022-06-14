public class PrintSubsequences {


    public static void subsequences(String str,int Index, String newString){
        if(Index == str.length()){
            System.out.println(newString);
            return;
        }

        //If Current Character is part of new String
        subsequences(str,Index+1, newString + str.charAt(Index));

        //If Current Character is NOT part of new String
        subsequences(str,Index+1, newString);


    }
    public static void main(String[] args) {
        subsequences("abcd",0,"");
    }
}
