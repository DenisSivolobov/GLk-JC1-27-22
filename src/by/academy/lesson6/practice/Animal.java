package by.academy.lesson6.practice;

public class Animal {

    private String type;

    public void voice(){
        System.out.println(type + "Say something");
    }

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
