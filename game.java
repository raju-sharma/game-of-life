import java.util.Scanner;
public class game {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] grid = new int [row][col];
        // userInput
        userInput.initialize(grid);
        //print user inputgrid(grid);
        printInputGrid.print(grid);
        int [][] nextgrid = new int[row][col];
        //calculate next generation
        calculateNextGeneration.generate(grid,nextgrid);
        //print next generation
        System.out.println("Output Matrix");
        printOutputGrid.print(nextgrid);
    }
}
