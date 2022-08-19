package by.academy.lesson6.RobotsFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FactoryBody factoryBody = new FactoryBody();
        FactoryBody factoryHead = new FactoryBody();

        List<Robot> robots = new ArrayList<>();
        robots.add(new Robot("Version 1", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 2", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 3", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 4", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 5", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 6", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 7", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 8", factoryBody.createBody(), factoryHead.createHead()));
        robots.add(new Robot("Version 9", factoryBody.createBody(), factoryHead.createHead()));

        for (Robot robocop : robots) {
            System.out.println(robocop);
        }
    }
}

