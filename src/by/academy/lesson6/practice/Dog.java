package by.academy.lesson6.practice;

public class Dog extends Animal{
    public Dog(String type) {
        super(type);
    }


    @Override
    public void voice(){
        System.out.println(" gav gav " + super.getType());
        super.voice();
    }


}
