package aula09;
import java.util.Objects;

public class MilitaryPlane extends Plane {
    private int numero_munições;

    public MilitaryPlane(String identificador, String fabricante, String modelo, int ano_producao, int máx_passageiros, int velocidade_máxima, int numero_munições) {
        super(identificador, fabricante, modelo, ano_producao, máx_passageiros, velocidade_máxima);
        this.numero_munições = numero_munições;
    }


    public int getNumero_munições() {
        return this.numero_munições;
    }

    public void setNumero_munições(int numero_munições) {
        this.numero_munições = numero_munições;
    }
    
    @Override
    public String getPlaneType() {
        return "Militar";
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MilitaryPlane)) {
            return false;
        }
        MilitaryPlane militaryPlane = (MilitaryPlane) o;
        return numero_munições == militaryPlane.numero_munições;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero_munições);
    }

    @Override
    public String toString() {
        return super.toString() +" numero_munições='" + getNumero_munições();
    }

}