public class Interface{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.print("moves in all direction");
    }
}
class Rook implements Chessplayer{
   public void moves(){
        System.out.print("moves up down left right");
    }
}
// interface helped in making blue print for the class
// interface is used 