package by.academy.lesson10.inTheClassroom;

import java.util.Locale;

public class Runner {

    public static void main(String[] args) {
        String str =null;
        try {
            System.out.println(str.toUpperCase(Locale.ROOT));
        } catch (NullPointerException e) {
            //e.printStackTrace(); можно использовать различные методы
            // log.error("") -> логирование
            System.out.println("Error in block catch");
        }

        System.out.println("Code after try-catch");
    }
}
