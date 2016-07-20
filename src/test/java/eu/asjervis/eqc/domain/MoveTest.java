package eu.asjervis.eqc.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import eu.asjervis.eqc.domain.enumeration.MoveState;

public class MoveTest
{
    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, -10, -10, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, -10, -10, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(-10, -10, -10, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, -10, 10, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, -10, 10, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(-10, -10, 10, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, -10, 0, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, -10, 0, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(-10, -10, 0, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, 10, -10, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, 10, -10, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(-10, 10, -10, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, 10, 10, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, 10, 10, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(-10, 10, 10, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, 10, 0, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, 10, 0, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(-10, 10, 0, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, 0, -10, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, 0, -10, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(-10, 0, -10, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, 0, 10, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, 0, 10, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(-10, 0, 10, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(-10, 0, 0, -10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(-10, 0, 0, 10);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsNegativeAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(-10, 0, 0, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(10, -10, -10, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(10, -10, -10, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(10, -10, -10, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(10, -10, 10, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(10, -10, 10, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(10, -10, 10, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(10, -10, 0, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(10, -10, 0, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(10, -10, 0, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(10, 10, -10, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(10, 10, -10, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(10, 10, -10, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(10, 10, 10, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(10, 10, 10, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(10, 10, 10, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(10, 10, 0, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(10, 10, 0, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(10, 10, 0, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(10, 0, -10, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(10, 0, -10, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(10, 0, -10, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(10, 0, 10, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(10, 0, 10, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(10, 0, 10, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(10, 0, 0, -10);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(10, 0, 0, 10);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsPositiveAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(10, 0, 0, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(0, -10, -10, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(0, -10, -10, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(0, -10, -10, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(0, -10, 10, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(0, -10, 10, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(0, -10, 10, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(0, -10, 0, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(0, -10, 0, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsNegativeAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(0, -10, 0, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(0, 10, -10, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(0, 10, -10, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(0, 10, -10, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(0, 10, 10, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(0, 10, 10, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(0, 10, 10, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(0, 10, 0, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(0, 10, 0, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsPositiveAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(0, 10, 0, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsNegative()
    {
        final Move move = new Move(0, 0, -10, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsPositive()
    {
        final Move move = new Move(0, 0, -10, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsNegativeAndDestinationYIsZero()
    {
        final Move move = new Move(0, 0, -10, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsNegative()
    {
        final Move move = new Move(0, 0, 10, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsPositive()
    {
        final Move move = new Move(0, 0, 10, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsPositiveAndDestinationYIsZero()
    {
        final Move move = new Move(0, 0, 10, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsNegative()
    {
        final Move move = new Move(0, 0, 0, -10);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsPositive()
    {
        final Move move = new Move(0, 0, 0, 10);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void constructorWithSourceXIsZeroAndSourceYIsZeroAndDestinationXIsZeroAndDestinationYIsZero()
    {
        final Move move = new Move(0, 0, 0, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void destinationXIsNegativeAndYIsNegative()
    {
        final Move move = new Move(0, 0, -10, -10);
        assertEquals(-10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
    }

    @Test
    public void destinationXIsNegativeAndYIsPositive()
    {
        final Move move = new Move(0, 0, -10, 10);
        assertEquals(-10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
    }

    @Test
    public void destinationXIsNegativeAndYIsZero()
    {
        final Move move = new Move(0, 0, -10, 0);
        assertEquals(-10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
    }

    @Test
    public void destinationXIsPositiveAndYIsNegative()
    {
        final Move move = new Move(0, 0, 10, -10);
        assertEquals(10, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
    }

    @Test
    public void destinationXIsPositiveAndYIsPositive()
    {
        final Move move = new Move(0, 0, 10, 10);
        assertEquals(10, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
    }

    @Test
    public void destinationXIsPositiveAndYIsZero()
    {
        final Move move = new Move(0, 0, 10, 0);
        assertEquals(10, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
    }

    @Test
    public void destinationXIsZeroAndYIsNegative()
    {
        final Move move = new Move(0, 0, 0, -10);
        assertEquals(0, move.getDestination().getX());
        assertEquals(-10, move.getDestination().getY());
    }

    @Test
    public void destinationXIsZeroAndYIsPositive()
    {
        final Move move = new Move(0, 0, 0, 10);
        assertEquals(0, move.getDestination().getX());
        assertEquals(10, move.getDestination().getY());
    }

    @Test
    public void destinationXIsZeroAndYIsZero()
    {
        final Move move = new Move(0, 0, 0, 0);
        assertEquals(0, move.getDestination().getX());
        assertEquals(0, move.getDestination().getY());
    }

    @Test
    public void invalidMove()
    {
        final Move move = new Move(0, 0, 0, 0);
        move.setMoveState(MoveState.INVALID);
        assertEquals(MoveState.INVALID, move.getMoveState());
    }

    @Test
    public void sourceXIsNegativeAndYIsNegative()
    {
        final Move move = new Move(-10, -10, 0, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
    }

    @Test
    public void sourceXIsNegativeAndYIsPositive()
    {
        final Move move = new Move(-10, 10, 0, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
    }

    @Test
    public void sourceXIsNegativeAndYIsZero()
    {
        final Move move = new Move(-10, 0, 0, 0);
        assertEquals(-10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
    }

    @Test
    public void sourceXIsPositiveAndYIsNegative()
    {
        final Move move = new Move(10, -10, 0, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
    }

    @Test
    public void sourceXIsPositiveAndYIsPositive()
    {
        final Move move = new Move(10, 10, 0, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
    }

    @Test
    public void sourceXIsPositiveAndYIsZero()
    {
        final Move move = new Move(10, 0, 0, 0);
        assertEquals(10, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
    }

    @Test
    public void sourceXIsZeroAndYIsNegative()
    {
        final Move move = new Move(0, -10, 0, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(-10, move.getSource().getY());
    }

    @Test
    public void sourceXIsZeroAndYIsPositive()
    {
        final Move move = new Move(0, 10, 0, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(10, move.getSource().getY());
    }

    @Test
    public void sourceXIsZeroAndYIsZero()
    {
        final Move move = new Move(0, 0, 0, 0);
        assertEquals(0, move.getSource().getX());
        assertEquals(0, move.getSource().getY());
    }

    @Test
    public void takeMove()
    {
        final Move move = new Move(0, 0, 0, 0);
        move.setMoveState(MoveState.TAKE);
        assertEquals(MoveState.TAKE, move.getMoveState());
    }

    @Test
    public void validMove()
    {
        final Move move = new Move(0, 0, 0, 0);
        move.setMoveState(MoveState.VALID);
        assertEquals(MoveState.VALID, move.getMoveState());
    }

}
