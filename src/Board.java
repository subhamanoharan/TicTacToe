public class Board {

    private int player, x, y;

    private int[][] state;

    public Board() {
        state = new int[3][3];
    }

    public boolean move(int player, int x, int y) {
        if (isInvalidPosition(x, y))
            return false;
        this.player = player;
        this.x = player;
        this.y = player;
        return true;
    }

    public int playerAt(int x, int y) {
        if(x != this.x || y != this.y || isInvalidPosition(x, y))
            return -1;
        return player;
    }

    private boolean isInvalidPosition(int x, int y) {
        return x < 0 || y < 0 || x > 3 || y > 3;
    }

}
