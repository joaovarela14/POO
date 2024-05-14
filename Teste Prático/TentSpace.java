package TPRÁTICO;

public class TentSpace extends CampingSpace{
    private int duracao_maxima_aluguer;
    static int duracao_maxima_aluguer_default = 3*30;
    SpaceType type = SpaceType.TENT;

    public TentSpace(String localizacao, int[] largura_comprimento, int preco) {
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
