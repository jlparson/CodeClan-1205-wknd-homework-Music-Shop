import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.Guitar, "spruce", "green", "string", 160.00, 200.00, 6);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.Guitar, guitar.getInstrumentType());
    }

    @Test
    public void canGetType(){
        assertEquals("string", guitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("spruce", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("green", guitar.getColour());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(160.00, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(200.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetSound(){
        assertEquals("twang twang", guitar.play());
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(25, guitar.calculateMarkup(), 0.01);
    }

}
