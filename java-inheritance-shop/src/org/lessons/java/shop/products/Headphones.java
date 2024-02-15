package org.lessons.java.shop.products;

import org.lessons.java.shop.Product;

import java.math.BigDecimal;

public class Headphones extends Product {
    private String color;
    private boolean areWired;
    public Headphones(String name, String description, BigDecimal iva, BigDecimal price, String color, boolean areWired) throws IllegalArgumentException {
        super(name, description, iva, price);

        this.areWired = areWired;

        if (validColor(color)) {
            this.color = color;
        }
        else
            throw new IllegalArgumentException("ERROR: color parameter must contains at least 2 characters.");
    }

    private boolean validColor(String color) {
        return color.length() >= 2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(validColor(color))
            this.color = color;
    }

    public boolean isAreWired() {
        return areWired;
    }

    public void setAreWired(boolean areWired) {
        this.areWired = areWired;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", areWired=" + areWired +
                '}';
    }
}
