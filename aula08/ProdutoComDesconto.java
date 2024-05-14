package aula08;

public class ProdutoComDesconto implements Produto{
    private String nome;
    private double preco;
    private int quantidade;
    private int desconto;

    public ProdutoComDesconto(String nome, double preco, int quantidade, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto;
        
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        preco = preco - (preco * desconto / 100);
        return preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", preco=" + preco + ", quantidade em stock=" + quantidade;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    
}
