import org.junit.Test;
import org.robertwmurphy.cw8kyuWolfInSheepsClothing.WolfInSheepsClothing;

import static org.junit.Assert.assertEquals;

public class WolfInSheepsClothingTest {

    @Test
    public void warnTheSheepTest() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", WolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", WolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", WolfInSheepsClothing.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", WolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", WolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}
