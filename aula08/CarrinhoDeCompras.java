package aula08;
import java.util.ArrayList;


public class CarrinhoDeCompras implements Compra {
    public  ArrayList<Produto> lista_produtos = new ArrayList<Produto>();
    public double total = 0;

    @Override
    public void adicionarProduto(Produto produto, int quantidade){
        if (quantidade > produto.getQuantidade()){
            System.out.println("Quantidade de "  + produto.getNome() +" insuficiente em stock");
        }
        else{
            for (int i = 0; i < quantidade; i++) {
                lista_produtos.add(produto);
                System.out.println("Produto " + produto.getNome() +" adicionado ao carrinho");
            }
        }
    
    }

    public double setTotal(double total) {
        return this.total = total;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public void listarProdutos() {
        for (Produto produto : lista_produtos) {
            System.out.println(produto);
        }
    }

    @Override
    public void calcularTotal() {
        for (Produto produto : lista_produtos) {
            total += produto.getPreco();
        }

        setTotal(total);

       
        
    }


}


