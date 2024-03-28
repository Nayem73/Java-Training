package com.nayemtech;

public class Citizen {
    private String name;
    private String occupation;
    private String card;

    public Citizen(String name, String occupation, String card) {
        this.name = name;
        this.occupation = occupation;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
