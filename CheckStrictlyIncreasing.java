public class CheckStrictlyIncreasing {
    //Basically Check if array is sorted or not
    //TC= O(n)
    public static void StrictlyIncreasing(int arr[], int currentIndex){
        if(currentIndex == arr.length - 1){
            System.out.println("Strictly Increasing");
            return;
        }

        if(arr[currentIndex] >= arr[currentIndex+1]){
            System.out.println("Not Strictly Increasing");
            return;
        }

        StrictlyIncreasing(arr,currentIndex+1);


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,31,20};
        StrictlyIncreasing(arr,0);
    }
}
