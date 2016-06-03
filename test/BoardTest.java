import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoardTest {
    @Test
    public void shouldMovePlayerToPosition() {
        Board board = new Board();
        int player = 0;
        assertTrue(board.move(player, 1, 2));
    }

    @Test
    public void shouldNotMovePlayerToXPositionLessThan0() {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, -1, 2));
    }

    @Test
    public void shouldNotMovePlayerToYPositionLessThan0() {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, 2, -6));
    }

    @Test
    public void shouldNotMovePlayerToXPositionGreaterThan3() {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, 4, 2));
    }

    @Test
    public void shouldNotMovePlayerToYPositionGreaterThan3() {
        Board board = new Board();
        int player = 0;
        assertFalse(board.move(player, 2, 7));
    }

    @Test
    public void shouldReturnPlayerAtPosition(){
        Board board = new Board();
        int player = 1;

        board.move(player, 1, 1);
        assertEquals(board.playerAt(1, 1), player);
    }

    @Test
    public void shouldReturnPlayerAtPositionIfXandYMatch(){
        Board board = new Board();
        int player = 1;

        board.move(player, 1, 1);
        assertEquals(board.playerAt(2, 1), -1);
    }


    @Test
    public void shouldReturnNegativeIfThereIsNoPlayerAtPosition(){
        Board board = new Board();
        int player = 0;

        board.move(player, 1, 1);
        assertEquals(board.playerAt(0, 1), -1);
    }

    @Test
    public void shouldReturnNegativeIfPositionForPlayerIsInvalid(){
        Board board = new Board();
        int player = 0;

        board.move(player, 1, 1);
        assertEquals(board.playerAt(-3, 1), -1);
    }

    @Test
    public void shouldReturnPlayerAtPositionAfterMoreThanOneMove(){
        Board board = new Board();
        int player1 = 1;
        int player2 = 0;

        board.move(player1, 1, 1);
        board.move(player2, 1, 2);
        assertEquals(board.playerAt(1, 1), player1);
    }
}