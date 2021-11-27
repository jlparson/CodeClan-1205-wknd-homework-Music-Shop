package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(InstrumentType instrumentType, String material, String colour, String type, double purchasePrice, double sellPrice, int strings) {
        super(instrumentType, material, colour, type, purchasePrice, sellPrice);
        this.strings = strings;
    }

    public String play(){
        return InstrumentType.Guitar.getSound();
    }
}
