package by.academy.lesson6.exercise;

public class Cat extends Animal{

    private String name = "Кот";

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
