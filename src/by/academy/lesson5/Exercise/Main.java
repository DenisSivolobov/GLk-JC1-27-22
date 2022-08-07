package by.academy.lesson5.Exercise;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone);

        phone.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone.receiveCall("Alexander");
        phone2.receiveCall("Denis");
        phone3.receiveCall("Roma");

        Phone phone1 = new Phone();
        phone.Phone(555, "i");
        System.out.println(phone1);

        phone.receiveCall("Peter", 5557);

        phone.sendMessage(777);


    }

}
