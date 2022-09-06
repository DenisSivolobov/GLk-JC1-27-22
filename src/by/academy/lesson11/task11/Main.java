package by.academy.lesson11.task11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static final Path fileProducts = Path.of("src\\by\\academy\\lesson11\\task11\\resources\\", "product.txt");
    public static final Path fileOrders = Path.of("src\\by\\academy\\lesson11\\task11\\resources\\", "order.txt");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какую операцию Вы желаете совершить?\n\n"
                + "1 - Ввести товары\n"
                + "2 - Удалить товары\n"
                + "3 - Посмотреть список товаров\n"
                + "4 - Добавить заказ\n"
                + "5 - Удалить заказ\n"
                + "6 - Посмотреть список заказов\n"
                + "7 - Выход из программы\n"
                + "Введите число, соответствующее ответу: "
        );

        int choice = in.nextInt();

        switch (choice) {
            case 1 -> addProduct();
            case 2 -> deleteProduct();
            case 3 -> viewProduct();
            case 4 -> addOrder();
            case 5 -> deleteOrder();
            case 6 -> viewOrder();
            case 7 -> in.close();

            default -> System.out.println("Вы не сделали выбор");

        }

    }


    public static void addProduct() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите id товара: ");
        int id = in.nextInt();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите наименование товара: ");
        String ap = sc.nextLine();

        System.out.println("Введите дату производства товара: ");
        String data = sc.nextLine();

        Product product1 = new Product(id, ap, data);

        try (FileWriter writer = new FileWriter(String.valueOf(fileProducts), true)) {
            writer.append(product1.toString());
            writer.append("\n");
            System.out.println("Товар успешно добавлен");
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }

    public static void deleteProduct() {
        // не получилось, удаляет все товары

        Scanner in = new Scanner(System.in);
        System.out.println("Введите id товара для удаления: ");
        int id = in.nextInt();


        Stream<String> lines;
        try {
            lines = Files.lines(fileProducts);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedWriter writer = Files.newBufferedWriter(fileProducts)) {
            lines
                    .filter(line -> line.startsWith(String.valueOf(id)))
                    .forEach(line -> {
                        try {
                            writer.write(line);
                            writer.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void viewProduct() {

        System.out.println("Список всех имеющихся товаров: ");


        try (FileInputStream fileInputStream = new FileInputStream(String.valueOf(fileProducts))) {


            byte[] bytes1 = new byte[fileInputStream.available()];
            int count = 0;
            byte currentByte;

            while ((currentByte = (byte) fileInputStream.read()) != -1) {
                bytes1[count++] = currentByte;
            }

            String str = new String(bytes1);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void addOrder() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id заказа: ");
        int id = in.nextInt();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату заказа: ");
        String data = sc.nextLine();

        System.out.println("Введите наименование товара: ");
        String name = sc.nextLine();

        List<String> productsList = new ArrayList<>();
        productsList.add(0, String.valueOf(new Order(id, data, name)));

        try (FileWriter writer = new FileWriter(String.valueOf(fileOrders), true)) {
            writer.append(productsList.toString());
            writer.append("\n");
            System.out.println("Заказ успешно добавлен");
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }

    public static void viewOrder() {
        System.out.println("Список всех имеющихся заказов: ");
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(fileOrders)))) {
            String str1 = reader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(str1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteOrder() {
        //не вышло, удаляет все заказы

        System.out.println("Введите id заказа для удаления: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        Scanner in;
        try {
            in = new Scanner(new File(String.valueOf(fileOrders)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> deleteList = new ArrayList<>();
        String check;
        while (in.hasNextLine()) {
            check = in.nextLine();
            if (!check.startsWith(String.valueOf(id)))
                deleteList.add("Удалено\n");
        }
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(String.valueOf(fileOrders)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String s : deleteList)
            out.println(s);
        in.close();
        out.close();
    }
}
