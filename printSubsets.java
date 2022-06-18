import java.util.ArrayList;

public class printSubsets {
    //Same as print permutations of a string

    public static void printSubsetArrayList(ArrayList<Integer> subset){
        for (Integer I:
             subset) {
            System.out.println("Subset "+subset);
        }
    }

    public static void printSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubsetArrayList(subset);
            return;
        }
        //recursive call with current number
        subset.add(n);
        printSubsets(n-1,subset);

        //recursive call without current number
        subset.remove(subset.size()-1);
        printSubsets(n-1,subset);

    }

    public static void main(String[] args) {
        printSubsets(3, new ArrayList<Integer>());
    }

}
