package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Saxophone extends Instrument {

    private int bellKeys;

    public Saxophone(InstrumentType instrumentType, String material, String colour, String type, double purchasePrice, double sellPrice, int bellKeys) {
        super(instrumentType, material, colour, type, purchasePrice, sellPrice);
        this.bellKeys = bellKeys;
    }

    public String play(){
        return InstrumentType.Saxophone.getSound();
    }
}
