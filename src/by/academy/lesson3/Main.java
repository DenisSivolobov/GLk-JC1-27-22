package by.academy.lesson3;

import by.academy.lesson1.HelloWorld;

public class Main {
    public static void main(String[] args) {
//                                                                                                        задание 1
        //                                                                  1 цикл
        int x = 1;

        Cat cat = new Cat();
        System.out.println(cat);
        String Name = cat.getName();

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
        //                                                                  3 цикл (доделать)
        int y = 1;

        do {
            y++;
        } while (y <= 10);
        System.out.println(y);


//                                                                          4 цикл (доделать)
        int arr[] = new int[5];
        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;

        catMethod(arr);
    }

        private static void catMethod(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
               int t = (int)Math.random()+2;


            System.out.println("Котик № " + i + " лет " + t);
        }
    }





}
