package com.softserve.edu05.hw;

public class Car {
    private String type;
    private int productionYear;
    private int engineCapacity;

    public Car(String type, int productionYear, int engineCapacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
