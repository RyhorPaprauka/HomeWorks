package test;

import homework10.enums.FuelType;
import homework10.enums.PickupPayLoadCapacity;
import homework10.enums.TransmissionType;

import java.util.Objects;

public class Pickup extends Car {

    private PickupPayLoadCapacity payloadCapacity;

    public Pickup(String brand, String model, int productionYear, FuelType fuelType,
                  TransmissionType transmissionType, String bodyColor, PickupPayLoadCapacity payloadCapacity) {

        super(brand, model, productionYear, fuelType, transmissionType, bodyColor);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String toString() {
        return getBrand() + " " + payloadCapacity + " pickup";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pickup pickup = (Pickup) o;
        return payloadCapacity == pickup.payloadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), payloadCapacity);
    }
}
