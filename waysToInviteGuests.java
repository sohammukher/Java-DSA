public class waysToInviteGuests {

    public static int totalNumberOfWaysToInviteGuests = 0;

    public static int waysToInviteGuests(int numberOfGuests){
        System.out.println("Inside waysToInviteGuests numberOfGuests = "+numberOfGuests);

        //Do function Calls till only 1 Guest is remaining, we know we have only one way to call one guest
        if(numberOfGuests <= 1){
            totalNumberOfWaysToInviteGuests++;
            System.out.println(totalNumberOfWaysToInviteGuests);
            return 1;
        }

        //Two Ways To Call this Guest

        //Call This Guest Alone, in that case do Function call for other guests
        int callingAlone = waysToInviteGuests(numberOfGuests-1);

        //Call the Guest with another person and then do function call for others
        int numberOfChoicesForPairing = numberOfGuests - 1;

        int callingInPair = numberOfChoicesForPairing * waysToInviteGuests(numberOfGuests-2);


        int totalNumberOfPermuataions = callingAlone+ callingInPair;

        return totalNumberOfPermuataions;
    }

    public static void main(String[] args) {
        int n = 2;

        System.out.println("Total number of Ways to call" + " " + n + " " + "Guests" + " " + waysToInviteGuests(n) + " ");


    }}