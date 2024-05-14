package Avalição_2;
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderTester {
    public static void main(String[] args) throws FileNotFoundException {
        OrderManager orderManager = new OrderManager();

        Scanner sc = new Scanner(new FileReader("src//Avalição_2//pedidos.txt"));
        //ignora a primeira linha
        String line = sc.nextLine();

        while (sc.hasNext()) {
            line = sc.nextLine();
            String[] parts = line.split(";");
            int id = Integer.parseInt(parts[0]);
            String storeId = parts[1];
            String Composição = parts[2];
            String data = parts[3];


            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime orderDateTime = LocalDateTime.parse(data, formatter);
            
            boolean express = false;


            if (parts[4].equals("expresso")) {
                express = true;
            }

            String [] items_do_pedido = Composição.split("|");

            ArrayList<Item> items = new ArrayList<Item>();

            for (String item : items_do_pedido) {
                String[] itemParts = item.split(":");
                String name = itemParts[0];
                double price = Double.parseDouble(itemParts[1]);
                Item i = new Item(name, price);
                items.add(i);
            }

            Order order = new Order(id, items, storeId, orderDateTime, express);
            orderManager.addOrder(order);
        }

       orderManager.printAllOrders();

       orderManager.addOrder(null);

       orderManager.removeOrder(1);

       orderManager.searchOrder(1);

       orderManager.calculateOrderCost(1);

    }
    
}
