package instruments;

public enum InstrumentType {

    DRUM("Drum", "bang bang"),
    Flute("Flute", "toot toot"),
    Guitar("Guitar", "twang twang"),
    Piano("Piano", "plink plink"),
    Saxophone("Saxophone", "berrt berrt");


    private final String type;
    private final String sound;

    InstrumentType(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public String getType(){
        return type;
    }

    public String getSound(){
        return sound;
    }
}
