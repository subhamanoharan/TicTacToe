public class Board {

    public int player;
    public int x;
    public int y;

    public Board() {}

    public Board(int player, int x, int y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    public Board move(int player, int x, int y) {
        return new Board(player, x, y);
    }
}
