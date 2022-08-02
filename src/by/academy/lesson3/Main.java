package by.academy.lesson3;

import by.academy.lesson1.HelloWorld;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//                                                                                                        задание 1


        Cat cat = new Cat();
        System.out.println(cat);//                                                                    к заданию 2
        String Name = cat.getName();

        boolean w;
        w = Name.equals(cat.name2);//                                                                 к заданию 2
        System.out.println("Первое имя = второму " +w);

        //                                                                  1 цикл
        int x = 1;
        int Age = cat.getAge();

        while (x <= 10) {
            System.out.println(x + " имя " + Name + " возраст " + Age);
            x++;
        }

        //                                                                  2 цикл
        for (int i = 1; i <= 10; i++) {

            cat.setName("Vasiliy");
            cat.setAge(15);


            String newName = cat.getName();

            int newAge = cat.getAge();

            System.out.println(i + " имя " + newName + " возраст " + newAge);

        }
        //                                                                  3 цикл
        int y = 1;

        do {
            System.out.println(y + " имя " + Name + " возраст " +Age);
            y++;
        } while (y <= 10);
        System.out.println(y);


//                                                                          4 цикл
        int[] cats = new int[5];
        cats[0] = 4;
        cats[1] = 2;
        cats[2] = 6;
        cats[3] = 7;
        cats[4] = 8;

        for (int i = 0; i < 5; i++) {
            System.out.println(cats[i]);
        }


        catMethod(cats);
    }

        private static void catMethod(int[] arr) {
            for (int i = 0; i < arr.length; i++) {

                int a = 1;
                int b = 28;

               int t = (int)(a + Math.random()*b);

                Random random = new Random();
                int nName = random.nextInt();

            System.out.println("Котик " + nName + " № " + i + " лет " + t);
        }
    }





}
