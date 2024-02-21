package entities;

import entitiesEnum.OrderStatus;
import entities.OrderItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Product product;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();


    /////////////////////////////////////////////////////////////

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Product product, Client client) {
        this.moment = moment;
        this.status = status;
        this.product = product;
        this.client = client;
    }
    /////////////////////////////////////////////////////////////

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

//    public List<OrderItem> getOrderItems() {
//        return OrderItem;
//    }
    /////////////////////////////////////////////////////////////

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }


}