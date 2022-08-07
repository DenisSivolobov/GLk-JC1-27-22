package by.academy.lesson4;

import java.util.Random;

public class Matrix {

    public String gDouble() {
        Random random = new Random();
        StringBuilder n = new StringBuilder(String.valueOf(random.nextDouble(0, 10)));
        return n.toString();
    }

    public String gString() {
        Random random = new Random();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char x = (char) random.nextInt('a', 'z');
        }
        return s.toString();

    }


}

        














