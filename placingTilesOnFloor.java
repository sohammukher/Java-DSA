public class placingTilesOnFloor {

    //At Each Position we will have a choice to fill our current tile
    //Vertically or Horizontally

    static public int totalWays = 0;
    public static int countNumberOfWaysToPlaceTile(int n , int m){
        System.out.println("Inside countNumberOfWaysToPlaceTile n"+n+" m"+m);
        if(n<m){
            //if n < m --> we can only put tiles horizontally
            System.out.println("Hit Base Case, the Total Area is Covered by tile in One Way ");
            totalWays++;
            System.out.println("total Ways till now "+totalWays);
            return 1;
        }
        if(n==m){
            //if n == m --> there are only 2 ways to place the tiles
//            1) All vertical
//            2) All Horizontal
            System.out.println("m == n");
            totalWays+=2;
            System.out.println("total Ways till now "+totalWays);
            return 2;
        }


        //When we place one Horizontally all in that Row are to be placed Horizontally
        //with total tiles on the level = (total tiles on the side)/(Size of the Size other than m)
        //=> m/1 = m;
        int totalPathsifWePlaceVertiacally = countNumberOfWaysToPlaceTile(n-m,m);

        //in current row only one tile required to cover the whole row, unlike above case where
        //Total m tiles required to cover one section
        int totalPathsifWePlaceHorizontally =  countNumberOfWaysToPlaceTile(n-1,m);


        int totalWaysCalulation = totalPathsifWePlaceVertiacally+totalPathsifWePlaceHorizontally;
        return totalWaysCalulation;

    }

    public static void main(String[] args) {

        int n = 4;
        int m = 2;

        int totalTiles = countNumberOfWaysToPlaceTile(n,m);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Total ways "+totalTiles + " totalWays global variable "+totalWays);
        System.out.println("-----------------------------------------------------------------");
    }
}
