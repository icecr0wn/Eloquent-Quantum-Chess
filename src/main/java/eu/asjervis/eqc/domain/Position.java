package eu.asjervis.eqc.domain;

public class Position
{
    private final int x;
    private final int y;

    public Position(final int x, final int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass())
        {
            return false;
        }
        final Position other = (Position) obj;
        return this.x == other.x && this.y == other.y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.x;
        result = prime * result + this.y;
        return result;
    }
}
