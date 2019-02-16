package homework10.cars;

import homework10.enums.FuelType;
import homework10.enums.SedanBodyStyle;
import homework10.enums.TransmissionType;

import java.util.Objects;

public class Sedan extends Car {

    private SedanBodyStyle bodyStyle;

    public Sedan(String brand, String model, int productionYear, FuelType fuelType,
                 TransmissionType transmissionType, String bodyColor, SedanBodyStyle bodyStyle) {

        super(brand, model, productionYear, fuelType, transmissionType, bodyColor);
        this.bodyStyle = bodyStyle;
    }

    @Override
    public String toString() {
        return getBrand() + " " + bodyStyle + " sedan";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sedan sedan = (Sedan) o;
        return bodyStyle == sedan.bodyStyle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyStyle);
    }
}
