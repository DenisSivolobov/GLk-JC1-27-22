package by.academy.lesson2;

import java.util.Scanner;

public class Rainbow {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int color = 0;

        System.out.print (
                "Какой цвет радуги Вам нравится?\n\n"
                        + "1 - Красный\n"
                        + "2 - Оранжевый\n"
                        + "3 - Желтый\n"
                        + "4 - Зеленый\n"
                        + "5 - Голубой\n"
                        + "6 - Синий\n"
                        + "7 - Фиолетовый\n"
                        + "Введите число, соответствующее ответу: "
        );

        color = in.nextInt();

        if (color == 12) {
            System.out.println("Вы выбрали - Красно-желтый");
        }
        else if (color == 21) {
            System.out.println("Вы выбрали - Желто-красный");
        }

        switch (color) {
            case 1:
                System.out.println("Вы выбрали - Красный");
                break;

            case 2:
                System.out.println("Вы выбрали - Оранжевый");
                break;

            case 3:
                System.out.println("Вы выбрали - Желтый");
                break;

            case 4:
                System.out.println("Вы выбрали - Зеленый");
                break;

            case 5:
                System.out.println("Вы выбрали - Голубой");
                break;

            case 6:
                System.out.println("Вы выбрали - Синий");
                break;

            case 7:
                System.out.println("Вы выбрали - Фиолетовый");
                break;

            default:
                System.out.println ("Вы не выбрали цвет");

        }
    }
}

