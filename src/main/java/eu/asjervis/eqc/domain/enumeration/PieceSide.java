package eu.asjervis.eqc.domain.enumeration;

public enum PieceSide
{
    BLACK(-1), WHITE(1);

    private int score;

    private PieceSide(final int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return this.score;
    }
}
