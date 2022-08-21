package by.academy.lesson7.garage;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    Map<Car, Integer> garage = new HashMap<>();

    public void parking(Car car, int x) {
        if (!garage.containsKey(car)) {
            garage.put(car, garage.get(car) + x);
        }
        System.out.println(x + car.getNumberCar() + car.getBrand());
    }

    public void exit(Car car, int x) {
        if (garage.containsKey(car)) {
            garage.replace(car, garage.get(car) - x);
            System.out.println(x + car.getNumberCar() + car.getBrand());
        } else {
            garage.replace(car, 0);
        }
    }

    public void amount(String car) {
         for (Map.Entry<Car, Integer> x : garage.entrySet()) {
            System.out.println("Количество авто в гараже = " + x);
        }
    }
}
