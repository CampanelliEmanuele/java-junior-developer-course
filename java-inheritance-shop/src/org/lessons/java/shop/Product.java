package org.lessons.java.shop;

import java.math.BigDecimal;

public class Product {
    private final int code;
    private String name, description;
    private BigDecimal price, iva;

    public Product (String name, String description, BigDecimal iva, BigDecimal price) throws IllegalArgumentException {
        this.code = generateRandomCode(1, Integer.MAX_VALUE);

        if (isValidName(name))
            this.name = name;
        else
            throw new IllegalArgumentException("ERROR: Name cannot be empty or be a single character.");

        if (isValidIva(iva) && isValidPrice(price)) {
            this.iva = iva;
            this.price = price;
        }
        else
            throw new IllegalArgumentException("ERROR: both iva and price must have positive values.");

        this.description = isValidDesctiption(description) ? description : "";
    }

    /* EXERCISE METHODS */

    public BigDecimal showPrice(boolean withIva) {
        if (withIva)
            return BigDecimal.valueOf(price.doubleValue() + (price.doubleValue() * (iva.doubleValue() / 100d)));
        else
            return getPrice();
    }

    public String getFullName() {
        return code + name;
    }

    /* UTILS */

    private int generateRandomCode(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    /* INPUT VALIDATORS */

    private boolean isValidName(String name) {
        return name.length() >= 2;
    }

    private boolean isValidDesctiption(String description) {
        return description.isEmpty();
    }

    private boolean isValidIva(BigDecimal iva) {
        return iva.doubleValue() >= 0d && iva.doubleValue() <= 100d;
    }

    private boolean isValidPrice(BigDecimal price) {
        return price.doubleValue() >= 0d;
    }

    /* GETTER AND SETTER */

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidName(name))
            this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (isValidDesctiption(description))
            this.description = description;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        if (isValidIva(iva))
            this.iva = iva;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (isValidPrice(price))
            this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
