package homework10.garage;

import homework10.cars.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Использовал дополнительно List т.к. посчитал необходимым
что бы в гараж заходил и выходил конкретный экземляр класса
 и это лучший способ до которого я додумался
 если нужно было показать как я удаляю из HashMap
 я закоментил ниже.*/

public final class Garage {

    private static Map<Car, Integer> garage = new HashMap<>();
    private static List<Car> parkedCars = new ArrayList<>();

    private Garage() {
    }

    public static void putCarIntoGarage(Car car) {
        for (Car parkedCar : parkedCars) {
            if (parkedCar == car) {
                System.out.println("Данный " + car.getBrand() + " " + car.getModel() + " уже  запаркован");
                return;
            }
        }
        parkedCars.add(car);
    }

    public static void getOutCarFromGarage(Car car) {
        for (Car parkedCar : parkedCars) {
            if (parkedCar == car) {
                parkedCars.remove(car);
                return;
            }
        }
        System.out.println("Данный " + car.getBrand() + " " + car.getModel() + " отсутствует на парковке");
    }

    public static Map<Car, Integer> getGarage() {
        for (Car parkedCar : parkedCars) {
            garage.put(parkedCar, garage.containsKey(parkedCar) ? garage.get(parkedCar) + 1 : 1);
        }
        return garage;
    }

    public static void getCarNumberOfRequiredBrand(String carBrand) {
        int brandCarNumber = 0;
        for (Car key : garage.keySet()) {
            if (key.getBrand().equalsIgnoreCase(carBrand)) {
                brandCarNumber += garage.get(key);
            }
        }
        System.out.println("Кол-во " + carBrand + " в гараже: " + brandCarNumber);
    }

    /*public static void getOutCarFromGarage(Car car){
        if (!garage.containsKey(car)){
            System.out.println("Данное авто отсутствует в гараже");
        }else if (garage.get(car)>1){
            garage.replace(car,garage.get(car)-1);
        }else if (garage.get(car)==1) {
            garage.remove(car);
        }
    }*/
}
