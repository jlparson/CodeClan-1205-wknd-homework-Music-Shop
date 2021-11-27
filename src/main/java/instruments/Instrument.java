package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentType instrumentType;
    private String material;
    private String colour;
    private String type;
    private double purchasePrice;
    private double sellPrice;

    public Instrument(InstrumentType instrumentType, String material, String colour, String type, double purchasePrice, double sellPrice) {
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public InstrumentType getInstrumentType(){return instrumentType;}

    public String getMaterial() {return material;}

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getPurchasePrice(){return purchasePrice;};

    public double getSellPrice(){return sellPrice;};

    public String play() {return null;}

    public double calculateMarkup() {
        return (sellPrice - purchasePrice) / purchasePrice * 100;
    }


}
