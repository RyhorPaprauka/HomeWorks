package homework10.cars;

import homework10.enums.FuelType;
import homework10.enums.SeatingCapacity;
import homework10.enums.TransmissionType;

import java.util.Objects;

public class Minivan extends Car {

    private SeatingCapacity seatingCapacity;

    public Minivan(String brand, String model, int productionYear, FuelType fuelType,
                   TransmissionType transmissionType, String bodyColor, SeatingCapacity seatingCapacity) {

        super(brand, model, productionYear, fuelType, transmissionType, bodyColor);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return getBrand() + " " + seatingCapacity + " minivan";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Minivan minivan = (Minivan) o;
        return seatingCapacity == minivan.seatingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatingCapacity);
    }
}
