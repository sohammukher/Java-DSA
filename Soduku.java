import java.util.Scanner;

public class Soduku {
    public static void display(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(int[][] board, int i, int j) {
        //Base Case if our row is at (9,0) this will go out of bounds and exit the call and return
        //remember extent of i is only till (board.length-1) so board.length is out of bounds.
        if(i >= board.length - 1 || j >= board[0].length -1 ){//**THIS IS NOT ACCOUNTING THE LAST BLOCK
            System.out.println("if we hit this point means we have reached the answer");
            System.out.println("------------------------------------------------");
            display(board);
            System.out.println("------------------------------------------------");
            return;
        }
        //Remember we are setting below values in ni and nj because
        //We are not doing any increment or decrement in the recursion parameters
        int ni = 0;
        int nj = 0;

        //If we have moved to the last element of the current row
        //Move the first element of next row
        if(i == board.length - 1){
            ni = i+1;
            nj = 0;
        }else{
            //Just Move to the next element in the same row.
            ni = i;
            nj=j+1;
        }

        if(board[i][j] != 0){
            //If Already value is populated then we do not need to do anything
            solveSudoku(board,ni,nj);
        }else{
            //Here we need to populate value as 0 is populated here
            //Checking for all possible values from 1 to 9.
            for (int possibleVal = 1; possibleVal <=9 ; possibleVal++) {
                //We can put the value here if it is valid
                if(isValid(board,ni,nj,possibleVal) == true){
                    board[i][j] = possibleVal;
                    System.out.println("Value of "+possibleVal+" set at Index "+i+" "+j+" ");
                    //call for next blocks
                    solveSudoku(board,ni,nj);//we made the ni and nj variable to call for next elements only
                    //Back Tracking Statement
                    board[i][j] = 0;//This will be hit only when coming back from the call.
                }
            }
        }
    }

    private static boolean isValid(int[][] board, int x, int y, int possibleVal) {
//        x: row
//        y: col

        //Checking for whole row
        for (int col = 0; col < board[0].length; col++) {
            if(board[x][col] == possibleVal){
                return false;
            }
        }

        //Checking for whole column
        for (int row = 0; row < board.length; row++) {
            if(board[row][y] == possibleVal){
                return false;
            }
        }
        //Check for sub-matrix (block of 3 * 3)
        //Top left corner of the sub-matrix will be (3 * i/3, 3 * j/3) where (i,j) are the indices of
        //the given block

        int submatrix_i = x * x/3;
        int submatrix_j = y * y/3;
        System.out.println("Top Corner of sub matrix is at (i,j) => ( "+submatrix_i+", "+submatrix_j+" )");

        //Now Scan in the whole 3*3 block to see if the element is present or not
        //If present return false
        for (int i = 0; i < 3; i++) {
            for (int j = 0;  j< 3; j++) {
                int row = submatrix_i+i;
                int col = submatrix_j+j;
                if(board[row][col] == possibleVal){
                    System.out.println("Possible value "+possibleVal+" Found in sub-matrix returning false");
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
      int[][]  grid = { { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
                { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
                { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
                { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
                { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
                { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
                { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
                { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
                { 7, 4, 5, 0, 8, 6, 3, 1, 0 } };

        solveSudoku(grid, 0, 0);
    }
}
