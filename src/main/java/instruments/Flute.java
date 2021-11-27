package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Flute extends Instrument {

    private int toneHoles;

    public Flute(InstrumentType instrumentType, String material, String colour, String type, double purchasePrice, double sellPrice, int toneHoles) {
        super(instrumentType, material, colour, type, purchasePrice, sellPrice);
        this.toneHoles = toneHoles;
    }

    public String play(){
        return InstrumentType.Flute.getSound();
    }

}
