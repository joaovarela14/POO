package TPRÁTICO;
import java.util.Objects;

public class CampingSpace {
    private String localizacao;
    private int [] largura_comprimento;
    private int preco;
    SpaceType type = SpaceType.CAR;
    private int duracao_maxima_aluguer;



    public CampingSpace(String localizacao, int[] largura_comprimento, int preco) {
        this.localizacao = localizacao;
        this.largura_comprimento = largura_comprimento;
        this.preco = preco;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int[] getLargura_comprimento() {
        return this.largura_comprimento;
    }

    public void setLargura_comprimento(int[] largura_comprimento) {
        this.largura_comprimento = largura_comprimento;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public CampingSpace localizacao(String localizacao) {
        setLocalizacao(localizacao);
        return this;
    }

    public CampingSpace largura_comprimento(int[] largura_comprimento) {
        setLargura_comprimento(largura_comprimento);
        return this;
    }

    public CampingSpace preco(int preco) {
        setPreco(preco);
        return this;
    }

    public SpaceType getType() {
        return this.type;
    }

    public int getDuracao_maxima_aluguer() {
        return this.duracao_maxima_aluguer;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CampingSpace)) {
            return false;
        }
        CampingSpace campingSpace = (CampingSpace) o;
        return Objects.equals(localizacao, campingSpace.localizacao) && Objects.equals(largura_comprimento, campingSpace.largura_comprimento) && preco == campingSpace.preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(localizacao, largura_comprimento, preco);
    }

    @Override
    public String toString() {
        return "{" +
            " localizacao='" + getLocalizacao() + "'" +
            ", largura_comprimento='" + getLargura_comprimento() + "'" +
            ", preco='" + getPreco() + "'" +
            "}";
    }
    

}
