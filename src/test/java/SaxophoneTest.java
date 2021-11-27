import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(InstrumentType.Saxophone, "brass", "gold", "woodwind", 300, 450, 23);
    }


    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.Saxophone, saxophone.getInstrumentType());
    }

    @Test
    public void canGetType(){
        assertEquals("woodwind", saxophone.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(300, saxophone.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(450, saxophone.getSellPrice(), 0.01);
    }

    @Test
    public void canGetSound(){
        assertEquals("berrt berrt", saxophone.play());
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(50, saxophone.calculateMarkup(), 0.01);
    }

}
