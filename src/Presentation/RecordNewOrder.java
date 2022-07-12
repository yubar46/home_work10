package Presentation;

import domain.Order;
import domain.Service;
import util.ApplicationContext;


import java.util.Scanner;

public class RecordNewOrder implements Menu {
    Scanner console = new Scanner(System.in);

    @Override
    public Menu action() {

        System.out.println("enter customer name");
        String customerName = console.nextLine();

        Order order = new Order(customerName, Service.valueOf(selectService()));

        ApplicationContext.getInstance.getOrderTextFileService().Persist(order);
        System.out.println("order registered");
        return  new MainMenu();



    }

    private String selectService() {
            String service="";
        int serviceNumber;
        Boolean acceptableChoice = false;
        do {
            System.out.printf("%s %n %s %n %s %n %s %n", "SELECT THE SERVICE", "1-DINNER", "2-CONFERENCE", "3-ROOM");
             serviceNumber = console.nextInt();
            if (serviceNumber == 1 || serviceNumber == 2 || serviceNumber == 3){
                acceptableChoice = true;
            }else System.out.println("wrong number entered vtry again");
        } while (!acceptableChoice);
        switch (serviceNumber) {
            case 1:
                service= "DINNER";
            break;
            case 2:
                service= "CONFERENCE";
            break;
            case 3:
                service= "ROOM";

            
        }
        return service;

    }
}
