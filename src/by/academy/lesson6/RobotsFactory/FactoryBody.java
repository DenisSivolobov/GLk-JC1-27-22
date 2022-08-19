package by.academy.lesson6.RobotsFactory;

import java.util.Random;

public class FactoryBody implements CreatingOfRobots {

    @Override
    public Body createBody() {
        Random random = new Random();
        int numberBody = random.nextInt(3);
        return switch (numberBody) {
            case 1 -> Body.BODY_1;
            case 2 -> Body.BODY_2;
            default -> Body.BODY_3;

        };
    }

    @Override
    public Head createHead() {
        Random random = new Random();
        int numberHead = random.nextInt(3);
        return switch (numberHead) {
            case 1 -> Head.HEAD_1;
            case 2 -> Head.HEAD_2;
            default -> Head.HEAD_3;
        };
    }
}
