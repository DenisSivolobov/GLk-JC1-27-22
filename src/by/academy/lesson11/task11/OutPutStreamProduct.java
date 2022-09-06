package by.academy.lesson11.task11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OutPutStreamProduct {
    public static void main(String[] args) {
        File product = Path.of("c:\\Users\\denis\\IdeaProjects\\GLk-JC1-27-22\\src\\by\\academy\\lesson11\\task11\\resources\\", "product.txt").toFile();

        /*List<String> products = new ArrayList<>();
        products.add(String.valueOf(new Product(1, "Хлеб", "30.08.2022")));
        products.add(String.valueOf(new Product(2, "Масло", "25.08.2022")));
        products.add(String.valueOf(new Product(3, "Яйца", "28.08.2022")));

        try
                (FileOutputStream fileOutputStream = new FileOutputStream(product, true)) {
            OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
            var out = new BufferedWriter(writer);
            for (String line : products) {
                out.write(line);
                out.write(System.getProperty("line.separator"));
            }
            out.flush();
        } catch (IOException e) {
            System.err.println(e);
        }*/
    }
}

