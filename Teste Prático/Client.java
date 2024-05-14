package TPRÁTICO;
import java.util.Objects;

public class Client {
    int numero_contribuinte;
    String nome;
    ClientType tipo_cliente;


    public Client(int numero_contribuinte, String nome, ClientType tipo_cliente) {
        this.numero_contribuinte = numero_contribuinte;
        this.nome = nome;
        this.tipo_cliente = tipo_cliente;
    }

    public int getNumero_contribuinte() {
        return this.numero_contribuinte;
    }

    public void setNumero_contribuinte(int numero_contribuinte) {
        this.numero_contribuinte = numero_contribuinte;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClientType getTipo_cliente() {
        return this.tipo_cliente;
    }

    public void setTipo_cliente(ClientType tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public Client numero_contribuinte(int numero_contribuinte) {
        setNumero_contribuinte(numero_contribuinte);
        return this;
    }

    public Client nome(String nome) {
        setNome(nome);
        return this;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return numero_contribuinte == client.numero_contribuinte && Objects.equals(nome, client.nome) && Objects.equals(tipo_cliente, client.tipo_cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero_contribuinte, nome, tipo_cliente);
    }

    @Override
    public String toString() {
        return
            getNome()+ "[" + getTipo_cliente()  + ": " + getNumero_contribuinte()+ "].";
    }
    

    
}
