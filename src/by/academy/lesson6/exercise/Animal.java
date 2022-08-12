package by.academy.lesson6.exercise;

public class Animal {

    private String food;
    private String location;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }


    public void makeNoise() {
        System.out.println(" make noise");
    }

    public void eat() {
        System.out.println(" eat");
    }

    public void sleep() {
        System.out.println(" sleep");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
