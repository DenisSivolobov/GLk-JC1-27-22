package by.academy.lesson11.task11;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class Order {
    private int id;
    private String data;
    private String productsList;


    public Order(int id, String data, String productsList) {
        this.id = id;
        this.data = data;
        this.productsList = productsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProductsList() {
        return productsList;
    }

    public void setProductsList(String productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", productsList='" + productsList + '\'' +
                '}';
    }
}
