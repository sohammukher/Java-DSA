import java.util.concurrent.locks.Condition;

public class pathCountInMaze {

//    QUESTION
//    count total number of paths to move in a maze from (0,0) to (n.m)--> path till n-1 and m -1,
//    (n,m)---> this is Boundary
//    https://www.youtube.com/watch?v=xZykmhcWGuY&t=900s: 15:00

// 2 Condition Given
//We can only move right
//We can only go downwards
//-------------------------------------------------------------------------------------------------------

//SOLUTION
//from each block in the matrix we have 2 choices to move right (x,y+1) or move down (x+1, y)
//at each level total paths will be sum of the number of paths returned by our two possible choices
//so total paths = total paths which will be possible if we choose to move right +
//total Paths Possible if we move downwards
//    ---->
    //Total Paths = countNumberOfPathsFrom(i,j+1) + countNumberOfPathsFrom(i+1,j)

    public static int countNumberOfPathsFrom(int i, int j, int TargetYAxis, int TargetXAxis){
        //Remember Here We need to Count Till n -1 and m -1

        System.out.println("Inside countNumberOfPathsFrom "+i+" "+j);
        if(i == TargetYAxis-1 && j == TargetXAxis-1){
            return 1;//We have Reached the Desired Point ( TargetXAxis-1,TargetXAxis-1)
        }

        //IMPORTANT TO REMEMBER THE BOUNDARY CASE
        if(i == TargetYAxis || j == TargetXAxis){
            return 0;//We have Reached the Boundary Point ( TargetXAxis,TargetXAxis)
        }

        //Calculate total Paths if we move downwards
        int totalPathsifWeGoDown = countNumberOfPathsFrom(i+1,j,TargetYAxis,TargetXAxis);

        //Calculate total Paths if we move rightwards
        int totalPathsifWeGoRight = countNumberOfPathsFrom(i,j+1,TargetYAxis,TargetXAxis);

        int totalPathsAtCurrentLevel = totalPathsifWeGoDown + totalPathsifWeGoRight;

        return totalPathsAtCurrentLevel;
    }
    public static void main(String[] args) {
        int count = countNumberOfPathsFrom(0,0,3,3);

        System.out.println("Total number of Paths "+count);

    }
}
