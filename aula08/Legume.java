package aula08;
import java.util.Objects;

public  class  Legume  extends  Alimento  implements Vegetariano {
    String nome;

    public Legume(double proteinas, double calorias, double peso, String nome) {
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
        return  "Legume. Nome="  + nome +  " "  + super.toString();
    }

    @Override
    public boolean vegetariano() {
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Legume)) {
            return false;
        }
        Legume legume = (Legume) o;
        return Objects.equals(nome, legume.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

}
