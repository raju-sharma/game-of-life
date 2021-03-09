public class calculateNextGeneration {
    public static int sum(int [][] grid, int x, int y)
    {
        int row = grid.length;
        int col = grid[0].length;
        int sum =0;
        for(int i=-1; i < 2; i++)
        {
            for(int j = -1; j < 2; j++)
            {
                sum += grid[(x+i+row)%row][(y+j+col)%col];
            }
        }
        return sum;
    }
    public static void generate(int [][] grid, int[][] nextgrid)
    {
        for(int i=0; i < grid.length; i++)
        {
            for(int j=0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1 && (sum(grid,i,j) > 3 || sum(grid,i,j) < 2))
                {
                    nextgrid[i][j] = 0;
                }
                else if(grid[i][j] == 0 && sum(grid,i,j) == 3)
                {
                    nextgrid[i][j] = 1;
                }
                else
                {
                    nextgrid[i][j] = grid[i][j];
                }
            }
        }
    }
}
