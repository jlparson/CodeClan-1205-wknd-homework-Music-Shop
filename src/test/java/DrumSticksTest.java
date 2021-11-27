import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shopItems.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("ProMark Hickory Drumsticks", 6.00, 12.00);
    }


    @Test
    public void canGetType(){
        assertEquals("ProMark Hickory Drumsticks", drumSticks.getType());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(6.00, drumSticks.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(12.00, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(100, drumSticks.calculateMarkup(), 0.01);
    }


}
