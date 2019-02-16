package homework10.cars;

import homework10.enums.FuelType;
import homework10.enums.MinibusBodyStyle;
import homework10.enums.TransmissionType;

import java.util.Objects;

public class Minibus extends Car {

    private MinibusBodyStyle bodyStyle;

    public Minibus(String brand, String model, int productionYear, FuelType fuelType,
                   TransmissionType transmissionType, String bodyColor, MinibusBodyStyle bodyStyle) {

        super(brand, model, productionYear, fuelType, transmissionType, bodyColor);
        this.bodyStyle = bodyStyle;
    }

    @Override
    public String toString() {
        return getBrand() + " " + bodyStyle + " minibus";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Minibus minibus = (Minibus) o;
        return bodyStyle == minibus.bodyStyle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyStyle);
    }
}
