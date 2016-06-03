import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoardTest {
    @Test
    public void shouldMovePlayerToPosition() throws Exception {
        Board board = new Board();
        int player = 0;
        assertTrue(board.move(player, 1, 2));
    }

    @Test
    public void shouldNotMovePlayerToXPositionLessThan0() throws Exception {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, -1, 2));
    }

    @Test
    public void shouldNotMovePlayerToYPositionLessThan0() throws Exception {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, 2, -6));
    }

    @Test
    public void shouldNotMovePlayerToXPositionGreaterThan3() throws Exception {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, 4, 2));
    }

    @Test
    public void shouldNotMovePlayerToYPositionGreaterThan3() throws Exception {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, 2, 7));
    }
}