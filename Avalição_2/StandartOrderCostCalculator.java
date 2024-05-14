package Avalição_2;

public class StandartOrderCostCalculator implements OrderCostCalculator{
    @Override
    public  double calculateOrderCost(Order order) {
        if (order.isPedidoExpresso() == true) {
            return order.getPrice() * 1.30;
        } else {
            return order.getPrice();
        }
    }
}
