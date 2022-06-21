public class NQueenEasy {
    public static final int N = 4;

    static boolean isSafe(int board[][], int row, int col)
    {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }
    /* A utility function to print solution */
    static void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    public static boolean solveNQueens(int board[][], int col) {

        if (col >= N) {
            System.out.println("Found Solution");
            printSolution(board);
            return true;
        }
        //Traversing for all rows
        for (int row = 0; row < N; row++) {
            if (isSafe(board, row, col)) {
                System.out.println("Safe found at "+row+" "+col);
                board[row][col] = 1;

                if (solveNQueens(board, col + 1) == true)
                    return true;
                else {
                    //If subsequent placements don't reach a solution, then we Backtrack
                    board[row][col] = 0;
                }

            }
        }
        //Traversed all Rows For this Column, queen cant be placed return false
        //Placed after the for loop
        return false;
    }

    public static void main(String[] args) {
        int board[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        if (solveNQueens(board, 0) == false) {
            System.out.print("Solution does not exist");
        }

        //printSolution(board);
    }

}


