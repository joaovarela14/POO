package aula08;
import java.util.Objects;

public class Cereal extends Alimento  implements Vegetariano{
    String nome; 

    public Cereal(double proteinas, double calorias, double peso, String nome) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cereal. Nome=" + nome + " " + super.toString();
    }
    
    @Override
    public boolean vegetariano() {
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cereal)) {
            return false;
        }
        Cereal cereal = (Cereal) o;
        return Objects.equals(nome, cereal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

}