package TicTacToe;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int row = 0 ; row < board.length ; row++){
            for(int col = 0 ; col < board.length ; col++){
                board[row][col] = ' ';
            }
        }

        Scanner in = new Scanner(System.in);
        boolean gameOver = false;

        char player = 'X';

        while(!gameOver){
            display(board);
            System.out.print("Player " + player + " enter:");
            int row = in.nextInt();
            int col = in.nextInt();
            board[row][col] = player;
            gameOver = isCheck(board, player);

            if(gameOver){
                System.out.println("Player " + player + " won!");
            }else{
                player = (player == 'X') ? 'O' : 'X';
            }
        }
        in.close();
        display(board);

    }

    static void display(char[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static boolean isCheck(char[][] board, char player){
        //check for all the rows
        for(int row = 0 ; row < board.length ; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        //check for all the colss
        for(int col = 0 ; col < board.length ; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        //check for diagonals
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
}
