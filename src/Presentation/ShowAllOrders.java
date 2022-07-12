package Presentation;

import domain.Order;
import util.ApplicationContext;

import java.util.List;

public class ShowAllOrders implements Menu {
    @Override
    public Menu action() {
        List<Order> orders = ApplicationContext.getInstance.getOrderTextFileService().showAllOrders();
        orders.forEach(System.out::println);
        return new MainMenu();
    }
}
