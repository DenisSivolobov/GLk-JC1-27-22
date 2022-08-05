package by.academy.lesson4;

import java.util.Random;

public class Main1 {

    public static void main(String[] args) {

        int matrix[][] = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(i + Math.random());


                Random random = new Random();
                int nName = random.nextInt();
                System.out.println(nName);
            }

        }


    }


}