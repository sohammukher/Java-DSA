import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {9,4,3,0,5,23,1,8};
        int length = arr.length;
        int StartIndex = 0;
        int MinimumElement = 0;
        int SwapElement = 0;
        //Traverse from start to finish of the array,
        //Shifting first index to right after every iteration
        for (int i = 0; i < length; i++) {
            System.out.println("First Element Now in Unsorted Array is "+arr[StartIndex]);
            MinimumElement = i;

            //For loop Checking Minimum Element in Unsorted Array
            for (int j = i+1; j < length; j++) {

                //Check if any element smaller than our beginning
                // element in the unsorted Array.
                if (arr[j] < arr[MinimumElement]){
                    //Minimum Element is actually the Index of the smallest Number
                    MinimumElement = j;
                }

            }

            //Swap position of Min element with First Index of the Unsorted Array
            SwappingElements(arr, StartIndex, MinimumElement);

            //Shifting Start of our Array to Right.
            StartIndex++;
        }
        System.out.println(Arrays.toString(arr));


    }

    private static void SwappingElements(int[] arr, int StartIndex, int MinumumElement) {
        int SwapElement;
        SwapElement = arr[StartIndex];
        arr[StartIndex] = arr[MinumumElement];
        arr[MinumumElement] = SwapElement;
    }
}
