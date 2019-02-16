package test;

import homework10.enums.FuelType;
import homework10.enums.TransmissionType;

import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private int productionYear;
    private FuelType fuelType;
    private TransmissionType transmissionType;
    private String bodyColor;

    public Car(String brand, String model, int productionYear, FuelType fuelType,
               TransmissionType transmissionType, String bodyColor) {

        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.bodyColor = bodyColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
