public class towerOfHanoi {
//Time Complexity
//    T(n) = T(n-1)[for transferring n-1 disks from source to helper] +
//    1[for transferring one disk from source to destination directly] +
//    T(n-1)[for transferring all the disks from helper to destination, using source as helper this time]
    // T(n) = 2T(n-1) + 1
    //IMPORTANT FINAL TC : O(2^n)

    public static void towerOfHanoi(int n, String src, String helper, String destination){
        if(n == 0){
            return;
        }

        //Remember Basic Algo as below -->

        //Move n - 1 Disks to Helper Tower, Here We need to Use Destination as Helper and
        //Helper as Source
        towerOfHanoi(n-1, src,destination,helper);

        //Move 1 Disk from Source to Destination
        System.out.println("\nTransferring Disk "+n+" from "+ src+" "+destination);

        //Moving n-1 disks from helper to destination, using source as helper
        towerOfHanoi(n-1,helper,src,destination);

    }
    public static void main(String[] args) {
        int n = 2;//Will take 7 steps
        towerOfHanoi(n, " SOURCE "," HELPER ", "DESTINATION");
    }
}
