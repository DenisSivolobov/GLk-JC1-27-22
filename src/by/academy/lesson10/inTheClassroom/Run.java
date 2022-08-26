package by.academy.lesson10.inTheClassroom;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Map;
import java.util.Random;


public class Run {
    private  static final Map<Integer, Throwable> EXCEPTION = Map.of(0, new RuntimeException("runtime"),
            1, new FileSystemNotFoundException("file not found"),
            3, new IndexOutOfBoundsException("index exception"));


    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(2);
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println(1);
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println(0);
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("my exception");
            e.printStackTrace();
        }
    }

    public static void unsafe(int randomValue) throws Throwable{
        Throwable throwable = EXCEPTION.getOrDefault(randomValue, new MyException("this is my exception"));
        throw throwable;
    }
}

