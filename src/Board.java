public class Board {

    public boolean move(int player, int x, int y) {
        if (x < 0 || y < 0 || x > 3 || y > 3) return false;
        return true;
    }
}
