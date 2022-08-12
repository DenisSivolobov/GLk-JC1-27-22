package by.academy.lesson5.lesson5;

public class Port {

    public static void main(String[] args) {

        Ship ship = new Ship();
        ship.setShip(10);

        int shipOfPorts = ship.getShip();

        System.out.println("В порту " + shipOfPorts + " кораблей");

        Deck deck = new Deck();
        int x = deck.getDeck1();
        int y = deck.getDeck2();
        System.out.println("Варианты палуб = " + x + " и " + y);




    }


}
