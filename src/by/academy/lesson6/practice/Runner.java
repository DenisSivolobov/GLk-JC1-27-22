package by.academy.lesson6.practice;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Пес ");
        dog.voice();

        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Bobik");

        System.out.println(dog1==dog2);
        System.out.println(dog1.equals(dog2));

        Animal2 animal2 = new Dog5();
        String name = animal2.voice(" name");
        System.out.println(name);




    }


}
