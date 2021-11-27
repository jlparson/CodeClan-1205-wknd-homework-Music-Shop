import instruments.Flute;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute(InstrumentType.Flute, "copper-nickel", "black", "woodwind", 80.00, 130.00, 16);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.Flute, flute.getInstrumentType());
    }

    @Test
    public void canGetType(){
        assertEquals("woodwind", flute.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("copper-nickel", flute.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", flute.getColour());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(80.00, flute.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(130.00, flute.getSellPrice(), 0.01);
    }

    @Test
    public void canGetSound(){
        assertEquals("toot toot", flute.play());
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(62.50, flute.calculateMarkup(), 0.01);
    }



}
