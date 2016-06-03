import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BoardTest {
    @Test
    public void shouldMovePlayerToPosition() throws Exception {
        Board board = new Board();
        int x = 1;
        int y = 2;
        int player = 0;
        Board new_board = board.move(player, x, y);

        assertEquals(new_board.x, x);
        assertEquals(new_board.y, y);
        assertEquals(new_board.player, player);
    }
}