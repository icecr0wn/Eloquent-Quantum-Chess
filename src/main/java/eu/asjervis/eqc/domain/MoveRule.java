package eu.asjervis.eqc.domain;

import java.util.List;

import eu.asjervis.eqc.domain.enumeration.MoveState;

public abstract class MoveRule
{
    public abstract List<Move> getMoves(Piece piece);

    public boolean isOnBoard(final Position position)
    {
        final int x = position.getX();
        final int y = position.getY();
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    MoveState processMove(final List<Move> moves, final Piece piece, final Move move, final MoveRuleProcessor processor)
    {
        return MoveState.INVALID;
    }

    boolean shouldStop(final MoveState moveState)
    {
        return MoveState.VALID != moveState;
    }
}
