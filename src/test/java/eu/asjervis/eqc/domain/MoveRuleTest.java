package eu.asjervis.eqc.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import eu.asjervis.eqc.domain.enumeration.MoveState;

public class MoveRuleTest
{
    private class TestMoveRule extends MoveRule
    {
        @Override
        public List<Move> getMoves(final Piece piece)
        {
            return new ArrayList<>();
        }

    }

    @Test
    public void positionIsDownOutsideBoard()
    {
        assertFalse(new TestMoveRule().isOnBoard(new Position(4, -1)));
    }

    @Test
    public void positionIsLeftOutsideBoard()
    {
        assertFalse(new TestMoveRule().isOnBoard(new Position(-1, 4)));
    }

    @Test
    public void positionIsOnBoard()
    {
        assertTrue(new TestMoveRule().isOnBoard(new Position(4, 4)));
    }

    @Test
    public void positionIsRightOutsideBoard()
    {
        assertFalse(new TestMoveRule().isOnBoard(new Position(9, 4)));
    }

    @Test
    public void positionIsUpOutsideBoard()
    {
        assertFalse(new TestMoveRule().isOnBoard(new Position(4, 9)));
    }

    @Test
    public void processMove()
    {
        System.out.println("#### @todo THIS TEST NEEDS IMPLEMENTING. See moverule.test.sh");
    }

    @Test
    public void shouldWeStopWithInvalidMove()
    {
        assertTrue(new TestMoveRule().shouldStop(MoveState.INVALID));
    }

    @Test
    public void shouldWeStopWithTakeMove()
    {
        assertTrue(new TestMoveRule().shouldStop(MoveState.TAKE));
    }

    @Test
    public void shouldWeStopWithValidMove()
    {
        assertFalse(new TestMoveRule().shouldStop(MoveState.VALID));
    }

}