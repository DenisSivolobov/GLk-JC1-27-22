package by.academy.lesson10.task10_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException3 extends Exception {

    public void genException3() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("");
    }

}

