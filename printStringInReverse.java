public class printStringInReverse {

    public static String reverseString(String str){
        if(str.length() == 1){
            return str;
        }

        String reverseStr = reverseString(str.substring(1)) +
                str.charAt(0);
        System.out.println(reverseStr);

        return reverseStr;
    }
    public static void main(String[] args) {
        reverseString("SOHAM");

    }
}
