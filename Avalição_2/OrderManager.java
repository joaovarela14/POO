package Avalição_2;
import java.util.*;

public class OrderManager {

    HashSet<Order> pedidos  = new HashSet<Order>();


    public void addOrder(Order order) {
        pedidos.add(order);
    }

    public void removeOrder(int id ) {
        for (Order order : pedidos) {
            if (order.getId() == id) {
                pedidos.remove(order);
            }
        }
    }

    public Order searchOrder(int id) {
        for (Order order : pedidos) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public double calculateOrderCost(int id){
        for (Order order : pedidos) {
            if (order.getId() == id) {
                StandartOrderCostCalculator calculator = new StandartOrderCostCalculator();
                return calculator.calculateOrderCost(order);
            }
        }
        return -1;
    }

    public void printAllOrders() {
        for (Order order : pedidos) {
            System.out.println(order);
        }
    }


    
}
