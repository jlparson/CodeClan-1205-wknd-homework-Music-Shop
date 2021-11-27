package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument {

    private int keys;

    public Piano(InstrumentType instrumentType, String material, String colour, String type, double purchasePrice, double sellPrice, int keys) {
        super(instrumentType, material, colour, type, purchasePrice, sellPrice);
        this.keys = keys;
    }

    public String play(){
        return InstrumentType.Piano.getSound();
    }
}
