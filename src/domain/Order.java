package domain;

import java.io.Serializable;

public class Order implements Serializable {
    private String customerName;
    private Service service;
    private Integer amount;


    public Order(String customerName, Service service) {
        this.customerName = customerName;
        this.service = service;

        if (this.service==Service.DINNER){
            this.amount=120;
        }else if (this.service==Service.CONFERENCE){
            this.amount=100;
        }else this.amount=150;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }



    public String toString(){
        return String.format("%s %s %d $",getCustomerName(),getService(),getAmount());
    }

}
