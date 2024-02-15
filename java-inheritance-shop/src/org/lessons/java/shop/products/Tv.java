package org.lessons.java.shop.products;

import org.lessons.java.shop.Product;

import java.math.BigDecimal;

public class Tv extends Product {
    private double height, width;
    private boolean isSmart;

    public Tv(String name, String description, BigDecimal iva, BigDecimal price, double height, double width, boolean isSmart) throws IllegalArgumentException {
        super(name, description, iva, price);

        this.isSmart = isSmart;

        if (validMeasure(height, width)) {
            this.height = height;
            this.width = width;
        }
        else
            throw new IllegalArgumentException("ERROR: height and width must be a positive numbers.");
    }

    private boolean validMeasure(double ...measures) {
        for (double measure : measures)
            if (measure < 0)
                return false;
        return true;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (validMeasure(height))
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (validMeasure(width))
            this.width = width;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "height=" + height +
                ", width=" + width +
                ", isSmart=" + isSmart +
                '}';
    }
}
