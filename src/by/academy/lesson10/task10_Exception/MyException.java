package by.academy.lesson10.task10_Exception;

public class MyException extends Exception {

    public void genException() {
        int array[] = {1, 2, 3};
        array[5] = 10;
    }
}
