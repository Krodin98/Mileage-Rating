
/**
 * Rhett Brink - RBrin0551
 * CIT 4423 01
 * Sep 16, 2022
 * macOS Sierra Version 10.12.6
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest extends Main {

    @Test
    public void testMain() {
        assertEquals(mpgRating.Excellent, Main.getmpgRating(45));
        assertEquals(mpgRating.Good, Main.getmpgRating(35));
        assertEquals(mpgRating.Fair, Main.getmpgRating(22));
        assertEquals(mpgRating.Poor, Main.getmpgRating(5));
    }
}