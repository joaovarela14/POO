package TPRÁTICO;
import java.util.Objects;

public class CaravanSpace extends CampingSpace {
    private int duracao_maxima_aluguer  = 3*365;

    SpaceType type = SpaceType.CARAVAN;

    public CaravanSpace(String localizacao, int[] largura_comprimento, int preco) {
        super(localizacao, largura_comprimento, preco);
    }


    public int getDuracao_maxima_aluguer() {
        return this.duracao_maxima_aluguer;
    }

    public void setDuracao_maxima_aluguer(int duracao_maxima_aluguer) {
        this.duracao_maxima_aluguer = duracao_maxima_aluguer;
    }


    public SpaceType getType() {
        return this.type;
    }


    @Override
    public String toString() {
        return "{" +
            " duracao_maxima_aluguer='" + getDuracao_maxima_aluguer() + "'" +
            "}";
    }



    
}
