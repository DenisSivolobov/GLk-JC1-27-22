package by.academy.lesson5.lesson5;

public class Deck {

    private int deck1 = 1;

    private int deck2 = deck1*2;

    Container container = new Container();

    int deck = container.getBigContainer()*2;
    int y = container.getSmallContainer()*4;




    public int getDeck1() {
        return deck1;
    }

    public void setDeck1(int deck1) {
        this.deck1 = deck1;
    }

    public void setDeck2(int deck2) {
        this.deck2 = deck2;
    }

    public int getDeck2() {
        return deck2;


    }
}
