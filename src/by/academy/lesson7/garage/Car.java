package by.academy.lesson7.garage;

import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private int yearOfIssue;
    private double engineVolume;
    private int mileage;
    private int numberCar;

    public Car(String brand, String model, int yearOfIssue, double engineVolume, int mileage, int numberCar) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.engineVolume = engineVolume;
        this.mileage = mileage;
        this.numberCar = numberCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfIssue == car.yearOfIssue && Double.compare(car.engineVolume, engineVolume) == 0 && mileage == car.mileage && numberCar == car.numberCar && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, engineVolume, mileage, numberCar);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", engineVolume=" + engineVolume +
                ", mileage=" + mileage +
                ", numberCar=" + numberCar +
                '}';
    }
}
