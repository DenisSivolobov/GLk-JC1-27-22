package by.academy.lesson6.exercise;

public class Horse extends Animal{

    private String name = "Лошадь";

    public Horse(String food, String location) {
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
