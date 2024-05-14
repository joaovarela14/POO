package teste2022;
import java.util.Objects;

public abstract class Activity {
    private int numero_participantes;
    private double preco;

    public Activity(int numero_participantes) {
        this.numero_participantes = numero_participantes;

    }

    public int getNumero_participantes() {
        return this.numero_participantes;
    }

    public void setNumero_participantes(int numero_participantes) {
        this.numero_participantes = numero_participantes;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) o;
        return numero_participantes == activity.numero_participantes && preco == activity.preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero_participantes, preco);
    }

    @Override
    public String toString() {
        return  " para " + getNumero_participantes() + " participantes  " +
            ", preço= " + getPreco() ;
    }
    
}
