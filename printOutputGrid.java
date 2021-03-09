public class printOutputGrid {

    public static void print(int [][] nextgrid)
    {
        for(int i=0; i < nextgrid.length; i++)
        {
            for(int j=0; j < nextgrid[0].length; j++) {
                System.out.print(nextgrid[i][j] +" ");
            }
            System.out.println();
        }
    }
}
