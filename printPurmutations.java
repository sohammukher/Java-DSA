import java.util.HashSet;
//WITH Redundancy means one character can Repeat many times
public class printPurmutations {
    public static HashSet<String> permutations = new HashSet<>();
    public static void printPermutaions(String str, int counterOfSize,  String newPermuation){
        if(counterOfSize == str.length()){
            //System.out.println(newPermuation);
            if(permutations.contains(newPermuation)){
                //Skip
                //This is not Unique
            }else{
                //Unique Print it
                permutations.add(newPermuation);
                System.out.println(newPermuation);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            printPermutaions(str,counterOfSize+1, newPermuation+str.charAt(i));
        }

    }

    public static void main(String[] args) {

        printPermutaions("abc",0,"");



    }
}

