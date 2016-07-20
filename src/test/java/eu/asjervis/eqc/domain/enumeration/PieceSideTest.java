package eu.asjervis.eqc.domain.enumeration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceSideTest
{

    @Test
    public void blackScore()
    {
        assertEquals(-1, PieceSide.BLACK.getScore());
    }

    @Test
    public void whiteSocre()
    {
        assertEquals(1, PieceSide.WHITE.getScore());
    }

}
