package Avalição_2;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.*;

public class Order {
    private int id;
    private ArrayList <Item> items = new ArrayList<Item>();
    private double price;
    private String storeId;
    private LocalDateTime orderDateTime;
    private boolean PedidoExpresso = false;

    public Order(int id, ArrayList<Item> items, String storeId, LocalDateTime orderDateTime, boolean express) {
        this.id = id;
        this.items = items;
        this.storeId = storeId;
        this.orderDateTime = orderDateTime;
        this.PedidoExpresso = express;
    }

    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getPrice() {
        for (Item item : items) {
            price += item.getPrice();
        }
        return this.price;
    }


    public String getStoreId() {
        return this.storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }


    public LocalDateTime getOrderDateTime() {
        return this.orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPedidoExpresso() {
        return this.PedidoExpresso;
    }

    public boolean getPedidoExpresso() {
        return this.PedidoExpresso;
    }





    @Override
    public String toString() {
        return 
            " id= " + getId() + "|" +
            ", price= " + getPrice() + "|" +
            ", storeId= " + getStoreId() + "|" +
            ", orderDateTime= " + getOrderDateTime();
    }
    
}
