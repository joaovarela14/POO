package Avaliaçao;

public abstract class Fighter {
    private String nome;
    public int vida = 100;
    private int vitorias = 0;
    private int derrotas = 0;


    public Fighter() {
    }

    public Fighter(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        setVida(vida);
       
    }

    public boolean isAlive(){
        if (getVida()> 0){
            return true;
        }

        return false;

    }

    public abstract void attack(Fighter fighter);


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    @Override
    public String toString() {
        return
            " nome='" + getNome() + "'" +
            ", vida='" + getVida() + "'" +
            ", vitorias='" + getVitorias() + "'" +
            ", derrotas='" + getDerrotas() ;
    }

  
}
