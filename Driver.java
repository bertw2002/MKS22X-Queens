public class Driver{
  public static void main(String[] args) {
    /*
    QueenBoard board = new QueenBoard(5);
    System.out.println(board);
    System.out.println(board.solve());
    System.out.println(board);
    for (int x = 0; x < 5; x++){
      for (int y = 0; y < 5; y++){
        System.out.print(board.getBoard(x, y) + " ");
      }
      System.out.println("");
    }*/
    QueenBoard board1 = new QueenBoard(20);
    System.out.println(board1.solve());
    System.out.println(board1);
    QueenBoard board2 = new QueenBoard(5);
    System.out.println(board2.countSolutions());
 }
}
