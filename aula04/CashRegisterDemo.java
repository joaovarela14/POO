package aula04;
import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price*quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("%-10s\t%5.2f\t%8d\t%5.2f",getName(),getPrice(),getQuantity(),getTotalValue());
    }
}


class CashRegister {
    private ArrayList<Product> lista_produtos = new ArrayList<>();

    public void addProduct(Product produto) {
        lista_produtos.add(produto);
    }

    public double getTotalValue() {
        double total = 0;
        for (Product p : lista_produtos) {
            total += p.getTotalValue();
        }
        return total;
    
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        System.out.printf("%-10s\t%5s\t%5s\t%5s\n","Product","Price","Quantity","Total");
        for (Product p : lista_produtos) {
            System.out.println(p);

        }
        sb.append("\nTotal value: " + getTotalValue()); //total de todos os produtos 
        return sb.toString();
    }
}

public class CashRegisterDemo {

    public static void main(String[] args) {
        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        System.out.println(cr);

    }
}