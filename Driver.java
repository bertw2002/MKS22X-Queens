public class Driver{
  public static void main(String[] args) {
    QueenBoard board = new QueenBoard(5);
    System.out.println(board);
    board.addQueen(3, 3);
    System.out.println(board);
    board.removeQueen(3, 3);
    System.out.println(board);
 }
}
