package by.academy.lesson4;

import java.util.Random;

public class Main1 {

    public static void main(String[] args) {


        int matrix[][] = new int[10][10];
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = r.nextInt(1000000);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String[] matr = new String[10];

        Random rand = new Random();
        for (int i = 0; i < matr.length; i++) {
            char x = (char) rand.nextInt('a', 'z');
            System.out.println(matr[i]);
        }
    }
}









