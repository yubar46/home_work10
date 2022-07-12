package Presentation;

import java.util.Scanner;

public class MainMenu implements Menu {
    @Override
    public Menu action() {


        switch (showMenu()){
            case 1:return new RecordNewOrder();
            case 2:return new  ShowAllOrders();
            case 3:System.exit(0);
        }
        return null;
    }

    private int showMenu(){
        boolean check=false;
        int choice;
        do {
            System.out.printf("%s %n%s%n%s%n","1-new order","2- view All orders","3-exit");
            Scanner console = new Scanner(System.in);
          choice= console.nextInt();
          if (choice==1||choice==2||choice==3)check =true;
          else System.out.println("wrong number entered try again");
        }while (!check);

        return choice;
    }
}
