package Service;

import domain.Order;
import repository.OrderTextFileRepository;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;

public class OrderTextFileServiceImpl implements OrderTextFileService {
    OrderTextFileRepository orderTextFileRepository;

    public OrderTextFileServiceImpl(OrderTextFileRepository orderTextFileRepository){
        this.orderTextFileRepository=  orderTextFileRepository;
    }

    @Override
    public void Persist(Order newOrder) {
        orderTextFileRepository.addToTextFile(newOrder);
        try(Formatter outPut = new Formatter("orders.txt")) {
            for (Order order:orderTextFileRepository.readAllOrders()) {

                outPut.format("%s;%s;%s %n",order.getCustomerName(),order.getService(),order.getAmount());


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Order> showAllOrders() {
        return orderTextFileRepository.readAllOrders();
    }
}
