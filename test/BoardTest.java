import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoardTest {
    @Test
    public void shouldMovePlayerToPosition() {
        Board board = new Board();
        assertTrue(board.move(Player.HUMAN, 1, 2));
    }

    @Test
    public void shouldNotMovePlayerToXPositionLessThan0() {
        Board board = new Board();
        assertFalse(board.move(Player.HUMAN, -1, 2));
    }

    @Test
    public void shouldNotMovePlayerToYPositionLessThan0() {
        Board board = new Board();
        assertFalse(board.move(Player.HUMAN, 2, -6));
    }

    @Test
    public void shouldNotMovePlayerToXPositionGreaterThan3() {
        Board board = new Board();
        assertFalse(board.move(Player.HUMAN, 4, 2));
    }

    @Test
    public void shouldNotMovePlayerToYPositionGreaterThan3() {
        Board board = new Board();
        assertFalse(board.move(Player.COMPUTER, 2, 7));
    }

    @Test
    public void shouldReturnPlayerAtPosition(){
        Board board = new Board();

        board.move(Player.COMPUTER, 1, 1);

        assertEquals(board.playerAt(1, 1), Player.COMPUTER);
    }

    @Test
    public void shouldReturnNegativeIfThereIsNoPlayerAtPosition(){
        Board board = new Board();

        board.move(Player.HUMAN, 1, 1);
        assertEquals(board.playerAt(0, 1), null);
    }

    @Test
    public void shouldReturnNegativeIfPositionForPlayerIsInvalid(){
        Board board = new Board();

        board.move(Player.HUMAN, 1, 1);
        assertEquals(board.playerAt(-3, 1), Player.INVALID);
    }

    @Test
    public void shouldReturnPlayerAtPositionAfterMoreThanOneMove(){
        Board board = new Board();

        board.move(Player.COMPUTER, 1, 1);
        board.move(Player.HUMAN, 1, 2);
        assertEquals(board.playerAt(1, 1), Player.COMPUTER);
    }
}