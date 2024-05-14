package Avaliaçao;
import java.util.Random;
public class Boxer extends Fighter{
    private int alcance;  

    public Boxer(String nome, int alcance, int vida) {
        super(nome, vida);
        this.alcance = alcance;
    }

    public void attack (Fighter adv){
        int distancia = new Random().nextInt(1,10) + 1;
        if (distancia > this.alcance){
            System.out.println("O adversario esta fora do alcance");
        }
        else{
            int dano = new Random().nextInt(1,100) ;
            System.out.println("O lutador " + adv.getNome() + " perdeu " + dano+ " pontos de vida!");
            

            adv.setVida(adv.getVida() - dano);

        }
    }
}
