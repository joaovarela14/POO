package TPRÁTICO;
import java.util.Objects;

public class CarSpace extends CampingSpace{
    private int duracao_maxima_aluguer;
    static int duracao_maxima_aluguer_default = 3*30;
    SpaceType type = SpaceType.CAR;

    public CarSpace(String localizacao, int[] largura_comprimento, int preco) {
        super(localizacao, largura_comprimento, preco);
    }

    public int getDuracao_maxima_aluguer() {
        return this.duracao_maxima_aluguer;
    }

    public void setDuracao_maxima_aluguer(int duracao_maxima_aluguer) {
        this.duracao_maxima_aluguer = duracao_maxima_aluguer;
    }

    public CarSpace duracao_maxima_aluguer(int duracao_maxima_aluguer) {
        setDuracao_maxima_aluguer(duracao_maxima_aluguer);
        return this;
    }


    public SpaceType getType() {
        return this.type;
    }

    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CarSpace)) {
            return false;
        }
        CarSpace carSpace = (CarSpace) o;
        return duracao_maxima_aluguer == carSpace.duracao_maxima_aluguer;
    }


    @Override
    public String toString() {
        return "{" +
            " duracao_maxima_aluguer='" + getDuracao_maxima_aluguer() + "'" +
            "}";
    }
    


    
}
