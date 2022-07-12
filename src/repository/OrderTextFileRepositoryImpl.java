package repository;

import domain.Order;
import domain.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTextFileRepositoryImpl implements OrderTextFileRepository {
    List<Order> orders;

    public OrderTextFileRepositoryImpl() throws IOException {

        this.orders = new ArrayList<>();
        if (Files.exists(Paths.get("orders.txt"))){
            Scanner input = new Scanner(Paths.get("orders.txt"));
            while (input.hasNext()){
                String line = input.nextLine();
                String[] split = line.split(";");
                String customerName = split[0];
                String service = split[1];
                String amount = split[2];


                Order order = new Order(customerName, Service.valueOf(service));
                orders.add(order);

            }

        }

    }



    @Override
    public List<Order> readAllOrders() {
        return this.orders;
    }

    @Override
    public void addToTextFile(Order order) {
        orders.add(order);


    }
}
