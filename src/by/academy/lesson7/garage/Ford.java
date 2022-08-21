package by.academy.lesson7.garage;

import java.util.Objects;

public class Ford extends Car{
    private int vinNumber;//уникальный номер для equals

    public Ford(String brand, String model, int yearOfIssue, double engineVolume, int mileage, int numberCar, int vinNumber) {
        super(brand, model, yearOfIssue, engineVolume, mileage, numberCar);
        this.vinNumber = vinNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return vinNumber == ford.vinNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNumber);
    }

    @Override
    public String toString() {
        return "Ford{" +
                "vinNumber=" + vinNumber +
                "} " + super.toString();
    }
}
