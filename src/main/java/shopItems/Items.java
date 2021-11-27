package shopItems;

import behaviours.ISell;
import instruments.Instrument;

public abstract class Items implements ISell {

    private String type;
    private double purchasePrice;
    private double sellingPrice;

    public Items(String type, double purchasePrice, double sellingPrice) {
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return (sellingPrice - purchasePrice) / purchasePrice * 100;
    }

}
