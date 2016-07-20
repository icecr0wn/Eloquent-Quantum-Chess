package eu.asjervis.eqc.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PositionTest
{
    @Test
    public void constructorWithXIsNegativeAndYIsNegative()
    {
        final Position position = new Position(-10, -10);
        assertEquals(-10, position.getX());
        assertEquals(-10, position.getY());
    }

    @Test
    public void constructorWithXIsNegativeAndYIsPositive()
    {
        final Position position = new Position(-10, 10);
        assertEquals(-10, position.getX());
        assertEquals(10, position.getY());
    }

    @Test
    public void constructorWithXIsNegativeAndYIsZero()
    {
        final Position position = new Position(-10, 0);
        assertEquals(-10, position.getX());
        assertEquals(0, position.getY());
    }

    @Test
    public void constructorWithXIsPositiveAndYIsNegative()
    {
        final Position position = new Position(10, -10);
        assertEquals(10, position.getX());
        assertEquals(-10, position.getY());
    }

    @Test
    public void constructorWithXIsPositiveAndYIsPositive()
    {
        final Position position = new Position(10, 10);
        assertEquals(10, position.getX());
        assertEquals(10, position.getY());
    }

    @Test
    public void constructorWithXIsPositiveAndYIsZero()
    {
        final Position position = new Position(10, 0);
        assertEquals(10, position.getX());
        assertEquals(0, position.getY());
    }

    @Test
    public void constructorWithXIsZeroAndYIsNegative()
    {
        final Position position = new Position(0, -10);
        assertEquals(0, position.getX());
        assertEquals(-10, position.getY());
    }

    @Test
    public void constructorWithXIsZeroAndYIsPositive()
    {
        final Position position = new Position(0, 10);
        assertEquals(0, position.getX());
        assertEquals(10, position.getY());
    }

    @Test
    public void constructorWithXIsZeroAndYIsZero()
    {
        final Position position = new Position(0, 0);
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());
    }

    @Test
    public void equalityWithDifferentXs()
    {
        final Position position1 = new Position(0, 0);
        final Position position2 = new Position(99, 0);
        assertFalse(position1.equals(position2));
        assertFalse(position2.equals(position1));
    }

    @Test
    public void equalityWithDifferentYs()
    {
        final Position position1 = new Position(0, 0);
        final Position position2 = new Position(0, 99);
        assertFalse(position1.equals(position2));
        assertFalse(position2.equals(position1));
    }

    @Test
    public void equalityWithEqualPositions()
    {
        final Position position1 = new Position(0, 0);
        final Position position2 = new Position(0, 0);
        assertTrue(position1.equals(position2));
        assertTrue(position2.equals(position1));
    }

    @Test
    public void equalityWithNull()
    {
        final Position position1 = new Position(0, 0);
        final Position position2 = null;
        assertFalse(position1.equals(position2));
    }

    @Test
    public void equalityWithOther()
    {
        final Position position = new Position(0, 0);
        final Object other = new Object();
        assertFalse(position.equals(other));
        assertFalse(other.equals(position));
    }

    @Test
    public void equalityWithSelf()
    {
        final Position position = new Position(0, 0);
        assertTrue(position.equals(position));
    }

    @Test
    public void hashingWithDifferentXs()
    {
        final Position position1 = new Position(0, 0);
        final Position position2 = new Position(99, 0);
        assertFalse(position1.hashCode() == position2.hashCode());
    }

    @Test
    public void hashingWithDifferentYs()
    {
        final Position position1 = new Position(0, 0);
        final Position position2 = new Position(0, 99);
        assertFalse(position1.hashCode() == position2.hashCode());
    }

    @Test
    public void hashingWithEqualPositions()
    {
        final Position position1 = new Position(0, 0);
        final Position position2 = new Position(0, 0);
        assertTrue(position1.hashCode() == position2.hashCode());
    }

    @Test
    public void hashingWithOther()
    {
        final Position position = new Position(0, 0);
        final Object other = new Object();
        assertFalse(position.hashCode() == other.hashCode());
    }

    @Test
    public void hashingWithSelf()
    {
        final Position position = new Position(0, 0);
        assertTrue(position.hashCode() == position.hashCode());
    }

    @Test
    public void xIsNegative()
    {
        final Position position = new Position(-10, 0);
        assertEquals(-10, position.getX());
    }

    @Test
    public void xIsPositive()
    {
        final Position position = new Position(10, 0);
        assertEquals(10, position.getX());
    }

    @Test
    public void xIsZero()
    {
        final Position position = new Position(0, 0);
        assertEquals(0, position.getX());
    }

    @Test
    public void yIsNegative()
    {
        final Position position = new Position(0, -10);
        assertEquals(-10, position.getY());
    }

    @Test
    public void yIsPositive()
    {
        final Position position = new Position(0, 10);
        assertEquals(10, position.getY());
    }

    @Test
    public void yIsZero()
    {
        final Position position = new Position(0, 0);
        assertEquals(0, position.getY());
    }

}
