import java.util.ArrayList;
import java.util.List;

public class NQueens {


    public static boolean isSafe(int row, int col, char[][] currentBoard){

        //Total 6 Condition : 2 : Straight --> Horizontal and Vertical
        //4: Diagonals
        //horizontal : Fixed Row Check for all Columns
        for (int i = 0; i < currentBoard.length; i++) {
            if (currentBoard[row][i] == 'Q') {
                System.out.println("Current Column Contains a Queen Already Not Safe Return False");
                return false;
            }
        }

        //vertical : Checking Rows With Column Constant
        for (int j = 0; j < currentBoard[0].length; j++) {
                if (currentBoard[j][col] == 'Q'){
                    System.out.println("Current Row Contains a Queen Already Not Safe Return False");
                    return false;
                }
        }
//----------------------------------------------------------------------------------------------------------------
        //Checking for Diagonals

        //Upper left decrease both row and column row-- and col -- to traverse in this direction
        for (int c= col, r = row; c >= 0 && r>= 0; r--,c--) {
            if (currentBoard[r][c] == 'Q'){
                System.out.println("QUEEN FOUND IN UPPER LEFT, Return False");
                return false;
            }
        }
        //Upper Right : Do Rows -- till 0 and Column ++ till board.length
        for (int c= col, r = row; c < currentBoard.length && r>= 0; r--,c++) {
            if (currentBoard[r][c] == 'Q'){
                System.out.println("QUEEN FOUND IN UPPER Right , Return False");
                return false;
            }
        }

        //Lower Left: Row ++ till  currentBoard[0].length and Column --
        for (int c= col, r = row; c >= 0 && r< currentBoard[0].length ; r++,c--) {
            if (currentBoard[r][c] == 'Q'){
                System.out.println("QUEEN FOUND IN Lower LEFT, Return False");
                return false;
            }
        }

        //Lower Right
        for (int c= col, r = row; c >= 0 && r >= 0; r--,c--) {
            if (currentBoard[r][c] == 'Q'){
                System.out.println("QUEEN FOUND IN Lower Right, Return False");
                return false;
            }
        }
        return true;
    }

    public static void placeQueen(char[][] currentBoard, List<List<String>> allBoards, int currentColumn){
        //means we have placed all the Queens in Current Path
        if(currentColumn == currentBoard.length){
            //We Reached a Solution Save this
            saveBoard(currentBoard,allBoards);
            System.out.println("Current Solution Saved Successfully");
            return;

        }
        //Going to all rows in our current Column
        for (int row = 0; row < currentBoard.length ; row++) {

            //Check if the current Position is Safe
            if (isSafe(row,currentColumn,currentBoard)) {
                //Current Position is Safe so Placing out queen here
                currentBoard[row][currentColumn] = 'Q';

                //Call the Function to Place Queen on the Next Column
                placeQueen(currentBoard,allBoards,currentColumn + 1);

                //If we hit Below Code Means That the Solution Was Incorrect or
                //Once we have Saved Previous Solution we will need to Change Configuration For New Solution
                //So we will remove queen from this previously allocated Spot
                currentBoard[row][currentColumn] = '.';

            }

        }

    }

    private static void saveBoard(char[][] currentBoard, List<List<String>> allBoards) {
        String currentRow = "";

        List<String> newBoard = new ArrayList<>();

        for (int row = 0; row < currentBoard.length; row++) {
            //For Every Row Reinitialise to Save Values Properly
            currentRow = "";
            for (int col = 0; col < currentBoard.length; col++) {
                if(currentBoard[row][col] == 'Q'){
                    currentRow+='Q';
                }else{
                    currentRow+='.';
                }
                //Saving Current Row into Temporary Board Before Saving
                newBoard.add(currentRow);

            }

        }
        //Saving the Current Board into Final Results Board
        allBoards.add(newBoard);
    }

    //n == number of Queens, n * n == Grid
    //Output -->List<List<String>>--->the outer Lists holds Lists of Board Configurations which represent each solution
    //Output = [[".Q..","...Q","Q...","..Q."]]===> Each ".Q.." is a ROW in the Board
    public static List<List<String>> solveNQueens(int n){

        List<List<String>> allBoards = new ArrayList<>();

        char[][] currentBoard = new char[n][n];
        placeQueen(currentBoard,allBoards,0);
        return allBoards;
    }

    public static void main(String[] args) {

        List<List<String>> solution = solveNQueens(4);

        List<List<String>> solution1 = solution;



    }
}
