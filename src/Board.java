public class Board {

    private Player[][] state;

    public Board() {
        state = new Player[3][3];
    }

    public boolean move(Player player, int x, int y) {
        if (isInvalidPosition(x, y))
            return false;
        state[x][y] = player;
        return true;
    }

    public Player playerAt(int x, int y) {
        if(isInvalidPosition(x, y))
            return Player.INVALID;
        return state[x][y];
    }

    private boolean isInvalidPosition(int x, int y) {
        return x < 0 || y < 0 || x > 3 || y > 3;
    }
}
