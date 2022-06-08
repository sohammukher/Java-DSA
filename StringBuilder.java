import java.io.Serializable;
import java.util.*;
public class StringBuilder {


    public static void main(String[] args) {

        java.lang.StringBuilder sb =new java.lang.StringBuilder("Soham");

        //Get Char at
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }

        //Change Char at a Specific Location
        sb.setCharAt(sb.length()-1, 'n');
        System.out.println(sb);

        //Insert at a Position in the String
        sb.insert(0,'s');
        System.out.println(sb);

        //Remove from a position
        sb.deleteCharAt(0);
        System.out.println(sb);

        System.out.println(sb);
    }
}
