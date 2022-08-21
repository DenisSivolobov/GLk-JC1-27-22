package by.academy.lesson7.garage;

import java.util.Objects;

public class Kia extends Car{

    private int vinNumber;

    public Kia(String brand, String model, int yearOfIssue, double engineVolume, int mileage, int numberCar, int vinNumber) {
        super(brand, model, yearOfIssue, engineVolume, mileage, numberCar);
        this.vinNumber = vinNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return vinNumber == kia.vinNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNumber);
    }

    @Override
    public String toString() {
        return "Kia{" +
                "vinNumber=" + vinNumber +
                "} " + super.toString();
    }
}
