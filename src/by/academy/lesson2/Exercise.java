package by.academy.lesson2;

    public class Exercise {

        public static void main(String[] args) {

            int k = 3;//                                                                            задание 1
            if (k > 2 && k < 5) {
                System.out.println("весна");
            }


            int as = 28; //                                                                         задание 2
            if (as == 3 || as % 10 == 3) {
                System.out.println("Последняя цифра данного числа = 3");
            } else {
                System.out.println("Последняя цифра данного числа != 3");
            }

            int zz = 27;//                                                                          задание 3
            if (zz == 1 ||zz%10==1) {
                System.out.println(zz + " рубль");
            }
            else if (zz%10 == 2 || zz%10 == 3 || zz%10 == 4) {
                System.out.println(zz + " рубля");
            }
            else if (zz%10 == 5 || zz%10 == 6 || zz%10 == 7 || zz%10 == 8 || zz%10 == 9) {
                System.out.println(zz + " рублей");
            }

            int qz = 4000;//                                                                        задание 4
            if (qz%4 == 0) {
                System.out.println("Год високосный");
            }
            else if (qz%4 == 0 && qz%100 == 0) {
                System.out.println("Год не високосный");
            }
            else if (qz%4 == 0 && qz%400 == 0) {
                System.out.println("Год високосный");
            }
            else {
                System.out.println("Другой год");
            }

        }




    }

