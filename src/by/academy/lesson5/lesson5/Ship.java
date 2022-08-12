package by.academy.lesson5.lesson5;

public class Ship {

    private int ship;
    private int deck;

    public static void main(String[] args) {


        int ships[] = new int[10];
        Deck deck = new Deck();

        ships[0] = deck.getDeck1();
        ships[1] = deck.getDeck2();
        ships[2] = deck.getDeck1();
        ships[3] = deck.getDeck2();
        ships[4] = deck.getDeck1();
        ships[5] = deck.getDeck2();
        ships[6] = deck.getDeck1();
        ships[7] = deck.getDeck2();
        ships[8] = deck.getDeck1();
        ships[9] = deck.getDeck2();

        System.out.println(ships[1]);



    }


    public int getShip() {
        return ship;
    }

    public void setShip(int ship) {
        this.ship = ship;
    }
}
