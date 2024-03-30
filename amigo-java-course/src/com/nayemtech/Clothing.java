package com.nayemtech;

public interface Clothing {
    Integer getID();
    void setID(Integer ID);
    String getName();
    void setName(String name);
    void addSize(Integer size);
    void getAllSize();
}
