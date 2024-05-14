package Avaliaçao;
import java.util.Random;

public class Wrestler extends Fighter {

    private int velocidade ;

    public Wrestler (String nome, int  velocidade, int vida) {
        super(nome, vida);
        this.velocidade = velocidade;
    }


    public void attack(Fighter adv){
        int distancia = new Random().nextInt(1,10) + 1;
        if (distancia > this.velocidade){
            System.out.println("O adversario esta fora do alcance");
        }
        else{
            int dano = new Random().nextInt(1,100) ;
            System.out.println("O lutador " + adv.getNome() + " perdeu " + dano+ " pontos de vida!");
            adv.setVida(adv.getVida() - dano);

        }
    
}
}
