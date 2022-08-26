package by.academy.lesson10.task10_Exception;

public class MyException2 extends Exception{

    public void genException2(){
        System.out.println(1/0);
    }
}
