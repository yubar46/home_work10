package util;

import Service.OrderTextFileService;
import Service.OrderTextFileServiceImpl;
import repository.OrderTextFileRepository;
import repository.OrderTextFileRepositoryImpl;

import java.io.IOException;

public   class ApplicationContext {

    public static  ApplicationContext getInstance;

  static {
        try {
            getInstance = new ApplicationContext();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static OrderTextFileRepository orderTextFileRepository;

    static {
        try {
            orderTextFileRepository = new OrderTextFileRepositoryImpl();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static OrderTextFileService orderTextFileService = new OrderTextFileServiceImpl(orderTextFileRepository);


    private ApplicationContext() throws IOException {
    }

    private static OrderTextFileRepository getOrderTextFileRepository() {
        return orderTextFileRepository;
    }

    public void setOrderTextFileRepository(OrderTextFileRepository orderTextFileRepository) {
        this.orderTextFileRepository = orderTextFileRepository;
    }

    public OrderTextFileService getOrderTextFileService() {
        return orderTextFileService;
    }

    public void setOrderTextFileService(OrderTextFileService orderTextFileService) {
        this.orderTextFileService = orderTextFileService;
    }
}
