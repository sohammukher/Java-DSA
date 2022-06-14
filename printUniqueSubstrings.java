import java.util.HashSet;

public class printUniqueSubstrings {

    public static void printUniqueSubstrings(String str, int Index, String newString, HashSet<String> UniqueSubStr){
        if(Index == str.length()){

            //Check if the String Exists in the Hashset, Remember Hashset can have unique Strings only
            //So there will be no Redundancy in general
            if(UniqueSubStr.contains(newString)){
               // System.out.println("the String "+newString+" is already present in the Hashset, no need add it");
            }else{
               // System.out.println(" Unique String Did not Occur Before "+newString);
                UniqueSubStr.add(newString);
                System.out.println(newString);
            }

            return;
        }

        //If Current Character is part of new String
        printUniqueSubstrings(str,Index+1, newString + str.charAt(Index),UniqueSubStr);

        //If Current Character is NOT part of new String
        printUniqueSubstrings(str,Index+1, newString,UniqueSubStr);
    }

    public static void main(String[] args) {
        printUniqueSubstrings("aaa",0,"",new HashSet<String>());
    }
}
