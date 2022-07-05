public class MergeSort {
    public static void divide(int arr[], int startIndex, int endIndex){

        if(startIndex >= endIndex){
            System.out.println("Base Case");
            return;
        }

        int mid = (startIndex+endIndex)/2;
        //BETTER SOLUTION: int mid = startIndex + (endIndex - startIndex)/2;

        //First Half of the array
        divide(arr,startIndex,mid);

        //Second half of the array
        divide(arr,mid+1,endIndex);

        //To Sort
        conquer(arr,startIndex,mid,endIndex);
    }

    private static void conquer(int[] arr, int startIndex, int mid, int endIndex) {
        int merged[] = new int[endIndex - startIndex +1];


    }

    //Divide an Conquer Method
    public static void main(String[] args) {

    }
}
