public class PrintFirstandLastOccurance {
    //Printing First and last Occurrence of a character in a String

    public static void Occurance(String str, int currentIndex, char TargetCharacter, int firstOccurance, int lastoccurance) {
        //Base Case
        if (currentIndex >= str.length()) {
            System.out.println("Hit Base Case");
            System.out.println("--------------------------------");
            System.out.println("First Occurrence "+firstOccurance+" Last Occurrence "+lastoccurance);
            System.out.println("--------------------------------");
            return;
        }

        if (str.charAt(currentIndex) == TargetCharacter) {
            System.out.println("Found at Index");
            if (firstOccurance == -1) {
                //If this variable is being set for the Very first time it will be -1.
                System.out.println("First Occurrence at " + currentIndex);
                firstOccurance = currentIndex;
            }
            else {
                System.out.println("Value Found at a Greater Index, Resetting Last Occurrence " + currentIndex);
                lastoccurance = currentIndex;
            }
        }

        //Making Recursive call
        Occurance(str, currentIndex + 1, TargetCharacter, firstOccurance, lastoccurance);
    }

    public static void main(String[] args) {
        Occurance("abaacdaefaah",0, 'a',-1,-1);
    }

}















































































































































