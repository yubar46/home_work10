package Service;

import domain.Order;
import repository.OrderTextFileRepository;

import java.util.ArrayList;
import java.util.List;

public interface OrderTextFileService {

    void Persist(Order newOrder);

    List<Order> showAllOrders();




}
