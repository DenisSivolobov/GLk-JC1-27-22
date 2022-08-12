package by.academy.lesson6.exercise;

public class Veterinarian extends Animal {

    public Veterinarian(String food, String location) {
        super(food, location);
    }

    public void treatAnimal(Animal animal) {

        System.out.println(super.getLocation() + super.getFood());
    }




}
