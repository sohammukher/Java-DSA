public class MoveallXToEND {
    //TC = O(n)
    public static void moveXToEnd(String str, String otherThanX, String X){
        if(str.length() == 0){
            System.out.println("Hit Base Case");
            System.out.println(otherThanX+X);
            return;
        }

        System.out.println("str.charAt(0) "+str.charAt(0));
        if((str.charAt(0) != 'x')){
            otherThanX += str.charAt(0);
            System.out.println("otherThanX "+otherThanX);
        }else{
            X+= str.charAt(0);
            System.out.println("X SUBSTRING "+X);
        }

        moveXToEnd(str.substring(1),otherThanX,X);

    }
    public static void main(String[] args) {
        moveXToEnd("xybxydxjjxtx","","");
    }
}
