import instruments.Flute;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shopItems.DrumSticks;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks;
    Flute flute;

    @Before
    public void before(){shop = new Shop();}

    @Test
    public void canAddStock(){
        shop.addStock(drumSticks);
        shop.addStock(flute);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(drumSticks);
        shop.addStock(flute);
        shop.removeFromStock(flute);
        assertEquals(1, shop.stockCount());
    }

}
