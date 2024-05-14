package aula08;
import java.util.Objects;

public class Alimento{
    private double proteinas;
    private double calorias;
    private double peso;

    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return " Calorias=" + calorias + ", peso=" + peso + ", proteinas=" + proteinas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alimento)) {
            return false;
        }
        Alimento alimento = (Alimento) o;
        return proteinas == alimento.proteinas && calorias == alimento.calorias && peso == alimento.peso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proteinas, calorias, peso);
    }


}