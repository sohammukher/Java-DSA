import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {


        int arr[] = {9,4,3,0,5,23,1,8};

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println("Inside I");

            //RUN J one less than the Index as it is accessing j + 1 which will result in Array Index Out of Bound.
            for (int j = 0; j < (arr.length -1)-i; j++) {
                System.out.println("Inside J");
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                    System.out.println("SWAPPING "+arr[j]+" "+arr[j+1]);

                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
