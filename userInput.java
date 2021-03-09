import java.util.Scanner;

public class userInput {
    public static void initialize(int [][] grid)
    {
        Scanner input = new Scanner(System.in);
        for(int i=0; i < grid.length; i++)
        {
            for(int j=0; j < grid[0].length; j++)
            {
                grid[i][j] = input.nextInt();
            }
        }
    }

}
