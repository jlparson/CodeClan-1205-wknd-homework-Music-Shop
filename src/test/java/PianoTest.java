import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.Piano, "wood", "black", "percussion", 9500.00, 13000.00, 88);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.Piano, piano.getInstrumentType());
    }

    @Test
    public void canGetType(){
        assertEquals("percussion", piano.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(9500.00, piano.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(13000.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetSound(){
        assertEquals("plink plink", piano.play());
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(36.84, piano.calculateMarkup(), 0.01);
    }

}
