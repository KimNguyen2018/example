package chapter7;
    
public class Section722 {
    
  public static final int QUEEN = 1;
  public static final int N = 8;
  public static int[][] board = new int[N][N];
  
  public static void main(String args[]) {                  
   
    System.out.println("Eight Queens Puzzle: ");
    playPuzzle(0, board, N);
    printBoard();        
  }

  public static void printBoard(){
      for (int row = 0; row < N; row++) {
         for (int col = 0; col < N; col++) {
            printItem(board[row][col]); 
            if (col != N - 1)                              
                System.out.print(" |");            
         }         
         
         System.out.println();
         if (row != N - 1) 
            System.out.println("-------------------------------");
      }
      
      System.out.println();
  }
  
  public static void printItem(int content){
      switch (content) {
         case 0:  System.out.print("  "); break;         
         case 1:  System.out.print(" Q"); break;
      }
  }
  public static boolean playPuzzle(int row, int[][] board, int N) {
      
    if(row>=N) return true;
    
    for(int pos = 0; pos < N; pos++) 
      if(isValid(board, row, pos, N)) {
        board[row][pos] = 1;
        if(!playPuzzle(row+1, board, N)) {
          board[row][pos] = 0;
        } else
          return true;
      }    
    return false;
  }

  static boolean isValid(int[][] board, int x, int y, int N) {
      
    int i, j;
    for(i = 0; i < x; i++)
      if(board[i][y]==1)  return false;
    
    i = x - 1;
    j = y - 1;
    
    while((i>=0)&&(j>=0))
      if(board[i--][j--]==1) return false;
    
    i = x - 1;
    j = y + 1;
    
    while((i>=0)&&(j<N))
      if(board[i--][j++]==1) return false;
    
    return true;
  }
}