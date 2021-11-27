import org.junit.Before;
import org.junit.Test;
import shopItems.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Beethoven's Moonlight Sonata", 8.00, 15.00);
    }

    @Test
    public void canGetType(){
        assertEquals("Beethoven's Moonlight Sonata", sheetMusic.getType());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(8.00, sheetMusic.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15.00, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(87.5, sheetMusic.calculateMarkup(), 0.01);
    }

}
