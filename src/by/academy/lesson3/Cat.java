package by.academy.lesson3;

public class Cat {

    private String name = "Barsik";
    private int age = 10;

//                                                                                           задание 2
    public String toString() {
        return "Cat " + "name " + name + " age " + age;
    }











    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
