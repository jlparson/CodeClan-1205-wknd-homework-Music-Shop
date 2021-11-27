import org.junit.Before;
import org.junit.Test;
import shopItems.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("D'Addario Guitar Strings", 12.00, 15.00);
    }

    @Test
    public void canGetType(){
        assertEquals("D'Addario Guitar Strings", guitarStrings.getType());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(12.00, guitarStrings.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15.00, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(25, guitarStrings.calculateMarkup(), 0.01);
    }

}
