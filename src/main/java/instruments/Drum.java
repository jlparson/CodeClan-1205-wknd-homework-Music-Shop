package instruments;

public class Drum extends Instrument{

    private int drumsticks;

    public Drum(InstrumentType instrumentType, String material, String colour, String type, double purchasePrice, double sellPrice, int drumsticks) {
        super(instrumentType, material, colour, type, purchasePrice, sellPrice);
        this.drumsticks = drumsticks;
    }

    public String play(){
        return InstrumentType.DRUM.getSound();
    }
}
