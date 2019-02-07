public class QueenBoard{
  private int[][] board;
  private int length;
  public QueenBoard(int size){
    board = new int[size][size];
    for (int x = 0; x < size; x++){
      for (int y = 0; y < size; y++){
        board[x][y] = 0;
      }
    }
    length = size;
  }
  //Make private
  public void addQueen(int r, int c){
    Qboard[r][c] = -1;
    placeQueen(r, c);
  }
  //Make private
  public void removeQueen(int r, int c){
    if (board[r][c] == -1) board[r][c] = 0;
    clearQueen(r, c);
  }
  //private
  //After deleting queen, this method opens the correct tiles.
  private void clearQueen(int r, int c){
    //closes vertical tiles.
    for (int x = 0; x < length; x++){
      if (board[x][c] != -1){
        board[x][c] = board[x][c] - 1;
      }
    }
    //closes horizontal tiles.
    for (int y = 0; y < length; y++){
      if (board[r][y] != -1){
        board[r][y] = board[r][y] - 1;
      }
    }
    //closes diagonal tiles in all directions.
    for (int x = r, y = c; x < length && y < length; x++, y ++){
      if (board[x][y] != -1) board[x][y] = board[x][y] - 1;
    }
    for (int x = r, y = c; x < length && y < length; x--, y--){
      if (board[x][y] != -1) board[x][y] = board[x][y] - 1;
    }
    for (int x = r, y = c; x < length && y < length; x--, y ++){
      if (board[x][y] != -1) board[x][y] = board[x][y] - 1;
    }
    for (int x = r, y = c; x < length && y < length; x++, y --){
      if (board[x][y] != -1) board[x][y] = board[x][y] - 1;
    }
  }
  //After putting queen, this method closes the correct tiles.
  private void placeQueen(int r, int c){
    //closes vertical tiles.
    for (int x = 0; x < length; x++){
      if (board[x][c] != -1){
        board[x][c] = board[x][c] + 1;
      }
    }
    //closes horizontal tiles.
    for (int y = 0; y < length; y++){
      if (board[r][y] != -1){
        board[r][y] = board[r][y] + 1;
      }
    }
    //closes diagonal tiles in all directions.
    for (int x = r, y = c; x < length && y < length; x++, y ++){
      if (board[x][y] != -1) board[x][y] = board[x][y] + 1;
    }
    for (int x = r, y = c; x >= 0 && y >= 0; x--, y--){
      if (board[x][y] != -1) board[x][y] = board[x][y] + 1;
    }
    for (int x = r, y = c; x >= 0 && y < length; x--, y ++){
      if (board[x][y] != -1) board[x][y] = board[x][y] + 1;
    }
    for (int x = r, y = c; x < length && y >= 0; x++, y --){
      if (board[x][y] != -1) board[x][y] = board[x][y] + 1;
    }
  }
  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *"""_ _ Q _
  *Q _ _ _
  *_ _ _ Q
  *_ Q _ _"""
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    String str = "";
    for (int x = 0; x < length; x++){
      for (int y = 0; y < length; y++){
        if (board[x][y] == -1)
          str += "Q ";
        else
          str += "_ ";
      }
      str += "\n";
    }
    return str;
  }

  /**
  *@return false when the board is not solveable and leaves the board filled with zeros;
  *        true when the board is solveable, and leaves the board in a solved state
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public boolean solve(){

    //if all cases don't work, return false at the end.
    return false;
  }

  /**
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  //public int countSolutions(){}
}
