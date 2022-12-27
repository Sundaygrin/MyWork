package chapterFive;

import java.util.Scanner;

public class TicTacToe {

    public static void displayGrid(char [][] grid)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(grid[i][j] + "|");
            }
            System.out.println();
        }
            
    }

    public static void main(String[] args) {

        char[][] grid = new char[3][3];

        grid[0][0] =' ';
        grid[0][1] =' ';
        grid[0][2] =' ';
        grid[1][0] =' ';
        grid[1][1] =' ';
        grid[1][2] =' ';
        grid[2][0] =' ';
        grid[2][1] =' ';
        grid[2][2] =' ';


        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            displayGrid(grid);
            System.out.println("Player 1 which roll and column do you choose? ");
            int player1Row = scanner.nextInt();
            int player1Column = scanner.nextInt();
            grid[player1Row][player1Column] = 'X';
            displayGrid(grid);

            System.out.println("Player 2 which roll and column do you choose? ");
            int player2Row = scanner.nextInt();
            int player2Column = scanner.nextInt();
            grid[player2Row][player2Column] = 'O';
        }




    }
}
