package repository;

import domain.Order;

import java.util.List;

public interface OrderTextFileRepository {

    List<Order> readAllOrders();
    void addToTextFile(Order order);
}
