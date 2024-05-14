package aula08;
import java.util.Objects;

public class Carne extends Alimento {
    VariedadeCarne variedade;

    public Carne(double proteinas, double calorias, double peso, VariedadeCarne variedade) {
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }

    public VariedadeCarne getVariedade() {
        return variedade;
    }

    public void setVariedade(VariedadeCarne variedade) {
        this.variedade = variedade;
    }

    @Override
    public String toString() {
        return "Carne. Variedade=" + variedade +  " " + super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carne)) {
            return false;
        }
        Carne carne = (Carne) o;
        return Objects.equals(variedade, carne.variedade);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(variedade);
    }



}
