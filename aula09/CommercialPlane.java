package aula09;
import java.util.Objects;

public class CommercialPlane extends Plane {
    private int numero_tripulantes;

    public CommercialPlane(String identificador, String fabricante, String modelo, int ano_producao, int máx_passageiros, int velocidade_máxima, int numero_tripulantes) {
        super(identificador, fabricante, modelo, ano_producao, máx_passageiros, velocidade_máxima);
        this.numero_tripulantes = numero_tripulantes;
    }

    public int getNumero_tripulantes() {
        return this.numero_tripulantes;
    }

    public void setNumero_tripulantes(int numero_tripulantes) {
        this.numero_tripulantes = numero_tripulantes;
    }

    @Override
    public String getPlaneType() {
        return "Comercial";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommercialPlane)) {
            return false;
        }
        CommercialPlane commercialPlane = (CommercialPlane) o;
        return numero_tripulantes == commercialPlane.numero_tripulantes;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero_tripulantes);
    }

    @Override
    public String toString() {
        return  super.toString()+" numero_tripulantes='" + getNumero_tripulantes();
    }


}
