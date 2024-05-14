package aula09;
import java.util.Objects;

public class Plane implements PLaneType {
    private String identificador, fabricante, modelo;
    private int ano_producao, máx_passageiros, velocidade_máxima;

    public Plane(String identificador, String fabricante, String modelo, int ano_producao, int máx_passageiros, int velocidade_máxima) {
        this.identificador = identificador;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano_producao = ano_producao;
        this.máx_passageiros = máx_passageiros;
        this.velocidade_máxima = velocidade_máxima;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno_producao() {
        return this.ano_producao;
    }

    public void setAno_producao(int ano_producao) {
        this.ano_producao = ano_producao;
    }

    public int getMáx_passageiros() {
        return this.máx_passageiros;
    }

    public void setMáx_passageiros(int máx_passageiros) {
        this.máx_passageiros = máx_passageiros;
    }

    public int getVelocidade_máxima() {
        return this.velocidade_máxima;
    }

    public void setVelocidade_máxima(int velocidade_máxima) {
        this.velocidade_máxima = velocidade_máxima;
    }

    public String getPlaneType() {
        return "Plane";
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Plane)) {
            return false;
        }
        Plane plane = (Plane) o;
        return Objects.equals(identificador, plane.identificador) && Objects.equals(fabricante, plane.fabricante) && Objects.equals(modelo, plane.modelo) && ano_producao == plane.ano_producao && máx_passageiros == plane.máx_passageiros && velocidade_máxima == plane.velocidade_máxima;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, fabricante, modelo, ano_producao, máx_passageiros, velocidade_máxima);
    }

    @Override
    public String toString() {
        return 
            " identificador='" + getIdentificador() + "'" +
            ", fabricante='" + getFabricante() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", ano_producao='" + getAno_producao() + "'" +
            ", máx_passageiros='" + getMáx_passageiros() + "'" +
            ", velocidade_máxima='" + getVelocidade_máxima();
    }


}
