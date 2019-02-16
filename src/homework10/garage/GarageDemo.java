package homework10.garage;

import homework10.cars.*;
import homework10.enums.*;

import java.util.Map;

public class GarageDemo {

    public static void main(String[] args) {

        Car mitsubishiL200 = new Pickup("Mitsubishi", "L200", 2010,
                FuelType.Diesel, TransmissionType.Manual, "Black", PickupPayLoadCapacity.Compact);
        Car renaultEspace = new Minivan("Renault", "Espace", 2012,
                FuelType.Gasoline, TransmissionType.Manual, "Grey", SeatingCapacity.Sevenseater);
        Car mitsubishiL200_2 = new Pickup("Mitsubishi", "L200", 2010,
                FuelType.Diesel, TransmissionType.Manual, "Black", PickupPayLoadCapacity.Compact);
        Car mitsubishiL200_4 = new Pickup("Mitsubishi", "L200", 2010,
                FuelType.Diesel, TransmissionType.Manual, "Black", PickupPayLoadCapacity.Compact);
        Car volkswagenAmarok = new Pickup("Volkswagen", "Amarok", 2013,
                FuelType.Gasoline, TransmissionType.Automatic, "Grey", PickupPayLoadCapacity.Heavyweight);
        Car renaultScenic = new Minivan("Renault", "Scenic", 2008,
                FuelType.Diesel, TransmissionType.Manual, "Yellow", SeatingCapacity.Nineseater);
        Car renaultEspace2 = new Minivan("Renault", "Espace", 2012,
                FuelType.Gasoline, TransmissionType.Automatic, "Grey", SeatingCapacity.Sevenseater);
        Car fordTransit = new Minibus("Ford", "Transit", 2004,
                FuelType.Diesel, TransmissionType.Manual, "Blue", MinibusBodyStyle.Cargo);
        Car gaz = new Minibus("Gaz", "322132", 2010,
                FuelType.Diesel, TransmissionType.Manual, "Yellow", MinibusBodyStyle.Passenger);
        Car renaultMaster = new Minibus("Renault", "Master", 2012,
                FuelType.Diesel, TransmissionType.Manual, "White", MinibusBodyStyle.Cargo);
        Car volkswagenGolf = new Sedan("Volkswagen", "Golf", 2019,
                FuelType.Gasoline, TransmissionType.Manual, "Yellow", SedanBodyStyle.Hatchback);
        Car volkswagenPolo = new Sedan("Volkswagen", "Polo", 2017,
                FuelType.Gasoline, TransmissionType.Automatic, "Grey", SedanBodyStyle.Classic);
        Car mitsubishiL200_3 = new Pickup("Mitsubishi", "L200", 2010,
                FuelType.Diesel, TransmissionType.Manual, "Grey", PickupPayLoadCapacity.Compact);
        Car mitsubishiLancer = new Sedan("Mitsubishi", "Lancer", 2011,
                FuelType.Diesel, TransmissionType.Manual, "Red", SedanBodyStyle.Classic);

        Garage.putCarIntoGarage(mitsubishiL200);
        Garage.putCarIntoGarage(mitsubishiL200_2);
        Garage.putCarIntoGarage(volkswagenAmarok);
        Garage.putCarIntoGarage(renaultEspace2);
        Garage.putCarIntoGarage(renaultScenic);
        Garage.putCarIntoGarage(renaultEspace);
        Garage.putCarIntoGarage(gaz);
        Garage.putCarIntoGarage(renaultMaster);
        Garage.putCarIntoGarage(fordTransit);
        Garage.putCarIntoGarage(volkswagenGolf);
        Garage.putCarIntoGarage(volkswagenPolo);
        Garage.putCarIntoGarage(mitsubishiL200_4);
        Garage.putCarIntoGarage(mitsubishiLancer);

        Garage.putCarIntoGarage(mitsubishiL200);

        Garage.getOutCarFromGarage(mitsubishiL200_3);

        for (Map.Entry entry : Garage.getGarage().entrySet()) {
            System.out.println(entry.getKey() + " кол-во: " + entry.getValue());
        }

        Garage.getCarNumberOfRequiredBrand("mitsubishi");
    }
}

