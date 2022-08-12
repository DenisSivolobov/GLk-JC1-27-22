package by.academy.lesson6.exercise;

public class Dog extends Animal{

    private String name = "Собака";


    public Dog(String food, String location) {
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
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
