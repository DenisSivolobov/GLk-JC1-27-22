package by.academy.lesson5.Exercise;

public class Phone {

    private int number = 788;
    private String model = "Model 99";
    private double weight = 15.5;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + number);
    }

    public void sendMessage(int number) {
        System.out.println(number);
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public void Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void Phone (int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone () {
        return;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
