package eu.asjervis.eqc.domain;

import eu.asjervis.eqc.domain.enumeration.MoveState;

public class Move
{
    private final Position source;
    private final Position destination;
    private MoveState      moveState;

    public Move(final int sourceX, final int sourceY, final int destinationX, final int destinationY)
    {
        this.source = new Position(sourceX, sourceY);
        this.destination = new Position(destinationX, destinationY);
        this.moveState = MoveState.INVALID;
    }

    public Position getDestination()
    {
        return this.destination;
    }

    public MoveState getMoveState()
    {
        return this.moveState;
    }

    public Position getSource()
    {
        return this.source;
    }

    public void setMoveState(final MoveState moveState)
    {
        this.moveState = moveState;
    }

}
