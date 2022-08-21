package by.academy.lesson7.garage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car ford = new Ford("Ford", "Mondeo", 1999, 1.8, 35000, 773783, 222);
        Kia kia = new Kia("Kia", "Travel", 2005, 1.6, 20000, 557896, 444 );
        Lada lada = new Lada("Lada", "Vesta", 2020, 1.6, 100, 332145, 888);
        Renault renault = new Renault("Renault","Laguna", 1996, 2.0, 434892, 334478, 147);

        Garage garage = new Garage();
        garage.parking(ford, 1);
        garage.parking(kia,2);
        garage.parking(lada, 3);
        garage.parking(renault, 4);

        garage.exit(kia, 1);

        garage.amount("lada");

        System.out.println(garage);


    }
}
