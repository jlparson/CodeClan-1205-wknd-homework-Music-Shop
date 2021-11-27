import instruments.Drum;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum(InstrumentType.DRUM, "maple", "blue", "percussion", 350.00, 500.00, 2);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.DRUM, drum.getInstrumentType());
    }

    @Test
    public void canGetType(){
        assertEquals("percussion", drum.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("maple", drum.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("blue", drum.getColour());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(350, drum.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(500, drum.getSellPrice(), 0.01);
    }

    @Test
    public void canGetSound(){
        assertEquals("bang bang", drum.play());
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(42.85, drum.calculateMarkup(), 0.01);
    }

}
