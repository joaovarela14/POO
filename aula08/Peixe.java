package aula08;
import java.util.Objects;

public class Peixe extends Alimento{
    TipoPeixe tipo;

    public Peixe(double proteinas, double calorias, double peso, TipoPeixe tipo) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public TipoPeixe getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixe tipo) {
        this.tipo = tipo;
    }

    @Override

    public String toString() {
        return "Peixe. Tipo=" + tipo + " " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Peixe)) {
            return false;
        }
        Peixe peixe = (Peixe) o;
        return Objects.equals(tipo, peixe.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo);
    }

}
