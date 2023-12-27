package com.nayemtech;

public class Bicycle extends Vehicle{
    private Boolean isGear;
    private Boolean hasCarrier;

    public Bicycle(String brand, int price, Boolean isGear, Boolean hasCarrier) {
        super(brand, price);
        this.isGear = isGear;
        this.hasCarrier = hasCarrier;
    }

    public Boolean getGear() {
        return isGear;
    }

    public void setGear(Boolean gear) {
        isGear = gear;
    }

    public Boolean getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(Boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "hasCarrier=" + hasCarrier +
                "} " + super.toString();
    }
}
