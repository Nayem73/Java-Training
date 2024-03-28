package com.nayemtech;

public class TollInfo {
    private double tollPrice;
    private String unit;
    private Double tollPricePerUnit;

    public TollInfo(double tollPrice, String unit, Double tollPricePerUnit) {
        this.tollPrice = tollPrice;
        this.unit = unit;
        this.tollPricePerUnit = tollPricePerUnit;
    }

    public double getTollPrice() {
        return tollPrice;
    }

    public void setTollPrice(double tollPrice) {
        this.tollPrice = tollPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getTollPricePerUnit() {
        return tollPricePerUnit;
    }

    public void setTollPricePerUnit(Double tollPricePerUnit) {
        this.tollPricePerUnit = tollPricePerUnit;
    }
}
