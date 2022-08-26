package by.academy.lesson10.task10_Exception;

import java.io.FileNotFoundException;

public class Main {
    private static MyException myException = new MyException();
    //myException.genException();
    private static MyException2 myException2 = new MyException2();
    // myException2.genException2();

    public static void main(String[] args) {


        try {
            myException2.genException2();
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.err.println("Нельзя делить на ноль");
        } finally {
            System.out.println("Блок finally");
        }


        try {
            myException.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Выход за пределы массива!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Блок finally");
        }


        try {
            myException.genException();
            myException2.genException2();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Объединение Exception");
        }

        MyException3 myException3 = new MyException3();
        try {
            myException3.genException3();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        }


    }
}

