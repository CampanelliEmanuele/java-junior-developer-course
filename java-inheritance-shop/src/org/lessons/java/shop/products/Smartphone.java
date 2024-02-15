package org.lessons.java.shop.products;

import org.lessons.java.shop.Product;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private String IMEI;
    private long memorySize;

    public Smartphone(String name, String description, BigDecimal iva, BigDecimal price, String IMEI, long memorySize) throws IllegalArgumentException {
        super(name, description, iva, price);

        if (validIMEI(IMEI))
            this.IMEI = IMEI;
        else
            throw new IllegalArgumentException("ERROR: IMEI string must be long 15 characters.");

        if (validMemorySize(memorySize))
            this.memorySize = memorySize;
        else
            throw new IllegalArgumentException("ERROR: memorySize must be a positive number.");

    }

    private boolean validIMEI(String IMEI) {
        return IMEI.length() == 15;
    }

    private boolean validMemorySize(long memorySize) {
        return memorySize >= 0;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        if (validIMEI(IMEI))
            this.IMEI = IMEI;
    }

    public long getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(long memorySize) {
        if (validMemorySize(memorySize))
            this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "IMEI='" + IMEI + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
