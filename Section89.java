package chapter8;

import java.util.Scanner;

public class Section89 {
   
   public static final int EMPTY = 0;
   public static final int X_ITEM = 1; // TOKEN: X
   public static final int O_ITEM = 2; // TOKEN: O
       
   public static final int DRAW = 1;
   public static final int X_WIN = 2;
   public static final int O_WIN = 3;
   public static final int FULLBOARD = 4;
 
   // The game board
   public static int[][] board = new int[3][3]; 
                                                      
   public static int status;                            
   public static int playerX, playerO; 
   public static int curRow, curCol;
 
   public static Scanner input = new Scanner(System.in); 
 
   public static void main(String[] args) {       
    printBoard();
    gameBoard();     
    do{ 
        if ( emptyBoard(board)) {
            enterGame(1,'X');
            printBoard(); 
            updateBoard(1, curRow, curCol); // for X
            //System.out.println("status: " + status);
            if (status ==0)
                if ( emptyBoard(board)) {
                    enterGame(2,'O'); 
                    printBoard();
                    updateBoard(2, curRow, curCol); // for O
                }                
            else
                status = FULLBOARD;
        }    
    }while (status ==0);
    
    if (status == X_WIN) 
        System.out.println("X player won");
    else if (status == O_WIN) 
            System.out.println("O player won");
        else if (status == DRAW || status ==4) 
            System.out.println("It's a Draw");              
   }
    
   // Classes
   public static boolean emptyBoard(int[][] boardGame){
       int count =0;
       for (int i=0; i<3; i++)
           for(int j=0; j<3; j++)
               if (boardGame[i][j] ==0) count ++;
        if (count == 0) return false;
        return true;
   }
   
   public static void gameBoard() {
      for (int row = 0; row < 3; ++row) 
         for (int col = 0; col < 3; ++col) 
            board[row][col] = 0;               
   }
 
   public static void enterGame(int item, char token) {
      boolean validInput = false;  // for input validation
      do {
          
          System.out.print("Enter a row (0, 1 or 2) for player " + token + " : ");
          int row = input.nextInt();
          System.out.print("Enter a column (0, 1 or 2) for player " + token + " : ");
          int col = input.nextInt();       
       // array index starts at 0.
         if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
            curRow = row;
            curCol = col;
            board[curRow][curCol] = item;            
            validInput = true;  
         } 
         else 
            System.out.println(" Not valid. Try again...");
      } while (!validInput);
   }
    
   public static void updateBoard(int item, int curRow, int curCol){
      if (winGame(item, curRow, curCol)) 
         status = (item == 1) ? X_WIN : O_WIN;
      else if (isDraw()) 
         status = 0;      
   }
    
   public static boolean isDraw() {
      for (int row = 0; row < 3; row++) 
         for (int col = 0; col < 3; col++) 
            if (board[row][col] == 0) 
               return false;
      return true;  
   }
 
   public static boolean winGame(int item, int curRow, int curCol) {
      return (board[curRow][0] == item
                   && board[curRow][1] == item
                   && board[curRow][2] == item
              || board[0][curCol] == item
                   && board[1][curCol] == item
                   && board[2][curCol] == item
              || curRow == curCol         
                   && board[0][0] == item
                   && board[1][1] == item
                   && board[2][2] == item
              || curRow + curCol == 2 
                   && board[0][2] == item
                   && board[1][1] == item
                   && board[2][0] == item);
   }
 
   /** Print the game board */
   public static void printBoard() {
       
      for (int row = 0; row < 3; row++) {
         for (int col = 0; col < 3; col++) {
            printItem(board[row][col]); 
            if (col != 3 - 1) 
               System.out.print("|");   
            
         }         
         System.out.println();
         if (row != 3 - 1) 
            System.out.println("-----------");
      }
      
      System.out.println();
   }
  
   public static void printItem(int content) {
      switch (content) {
         case 0:  System.out.print("   "); break;
         case 2: System.out.print(" O "); break;
         case 1:  System.out.print(" X "); break;
      }
   }
}