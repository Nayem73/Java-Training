package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Style1 extends Blazer{
    String name;
    List<Integer> sizes = new ArrayList<>();
    public Style1(Integer ID, String name, String styleName, Integer size) {
        super(ID, name);
        this.name = styleName;
        sizes.add(size);
    }

    public void addSize(Integer size) {
        sizes.add(size);
    }
    public void removeSize(Integer size) {
        sizes.remove(size);
    }

    public void getAllSize() {
        for (Integer curSize : sizes) {
            System.out.println(curSize);
        }
    }

    public String getName() {
        return name;
    }

    public void setStyleName(String styleName) {
        this.name = styleName;
    }

    public List<Integer> getSizes() {
        return sizes;
    }

    public void setSizes(List<Integer> sizes) {
        this.sizes = sizes;
    }
}
