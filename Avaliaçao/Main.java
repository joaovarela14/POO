package Avaliaçao;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fighter[] lista_lutadores = new Fighter[10];
        
        int choice = 0;
        do {
            System.out.println("Game menu:");
            System.out.println("1. Generate fighters");
            System.out.println("2. Show all fighters");
            System.out.println("3. Start fight between selected fighters");
            System.out.println("4. Start fight between random fighters");
            System.out.println("5. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                for (int i = 1; i < lista_lutadores.length +1 ; i++) {
                    String name = "Fighter " + (i);
                    int type =  new Random().nextInt(0,2);
                    if (type == 1) {
                        int alcance = new Random().nextInt(1,10) ;
                        lista_lutadores[i-1] = new Boxer(name, alcance,100);
                    } else {
                        int velocidade =new Random().nextInt(1,10) ;
                        lista_lutadores[i-1] = new Wrestler(name, velocidade,100);
                    }
                }
                    // generate fighters
                    break;
                case 2:
                    for (int i = 0; i < lista_lutadores.length; i++) {
                        System.out.println(lista_lutadores[i].toString());
                    }
                    // show fighters
                    break;
                case 3:
                    System.out.println("Escolha o primeiro lutador");
                    int fighter1 = sc.nextInt() -1 ;
                    System.out.println("Escolha o segundo lutador");
                    int fighter2 = sc.nextInt() -1;
                    while (fighter1 == fighter2) {
                        System.out.println("Escolha o segundo lutador");
                        fighter2 = sc.nextInt() -1;
                    }

                    while (lista_lutadores[fighter1].isAlive() && lista_lutadores[fighter2].isAlive()) {
                        lista_lutadores[fighter1].attack(lista_lutadores[fighter2]);
                        System.out.println("O lutador "+ lista_lutadores[fighter1].getNome() + " atacou o lutador " + lista_lutadores[fighter2].getNome() + " e o lutador " + lista_lutadores[fighter2].getNome() + " tem " + lista_lutadores[fighter2].getVida() + " de vida");

                        lista_lutadores[fighter2].attack(lista_lutadores[fighter1]);
                        System.out.println("O lutador "+ lista_lutadores[fighter2].getNome() + " atacou o lutador " + lista_lutadores[fighter1].getNome() + " e o lutador " + lista_lutadores[fighter1].getNome() + " tem " + lista_lutadores[fighter1].getVida() + " de vida");


                    }
                    if (lista_lutadores[fighter2-1].isAlive() == false) {
                        System.out.println("O lutador " + lista_lutadores[fighter1-1].getNome() + " ganhou");
                        lista_lutadores[fighter1-1].setVitorias(lista_lutadores[fighter1-1].getVitorias() + 1);
                        
                        lista_lutadores[fighter1-1].setVida(100);
                        lista_lutadores[fighter2-1].setDerrotas(lista_lutadores[fighter2-1].getDerrotas() + 1);
                        lista_lutadores[fighter2-1].setVida(100);

                    } else if (lista_lutadores[fighter1-1].isAlive() == false) {
                        System.out.println("O lutador " + lista_lutadores[fighter2-1].getNome() + " ganhou");
                        lista_lutadores[fighter2-1].setVitorias(lista_lutadores[fighter2-1].getVitorias() + 1);
                        lista_lutadores[fighter2-1].setVida(100);
                        lista_lutadores[fighter1-1].setDerrotas(lista_lutadores[fighter1-1].getDerrotas() + 1);
                        lista_lutadores[fighter1-1].setVida(100);
                    }

                    break;
                case 4:
                    int fighter3 = new Random().nextInt(0,9);
                    int fighter4 = new Random().nextInt(0,9);
                    while (fighter3 == fighter4) {
                        fighter4 = new Random().nextInt(0,9);
                    }

                    while (lista_lutadores[fighter3].isAlive() && lista_lutadores[fighter4].isAlive()) {
                        
                        lista_lutadores[fighter3].attack(lista_lutadores[fighter4]);
                        System.out.println("O lutador "+ lista_lutadores[fighter3].getNome() + " atacou o lutador " + lista_lutadores[fighter4].getNome() + " e o lutador " + lista_lutadores[fighter4].getNome() + " tem " + lista_lutadores[fighter4].getVida() + " de vida");
                        
                        lista_lutadores[fighter4].attack(lista_lutadores[fighter3]);
                        System.out.println("O lutador "+ lista_lutadores[fighter4].getNome() + " atacou o lutador " + lista_lutadores[fighter3].getNome() + " e o lutador " + lista_lutadores[fighter3].getNome() + " tem " + lista_lutadores[fighter3].getVida() + " de vida");
                    }

                    if (lista_lutadores[fighter4-1].isAlive() == false) {
                        System.out.println("O lutador " + lista_lutadores[fighter3-1].getNome() + " ganhou");
                        lista_lutadores[fighter3-1].setVitorias(lista_lutadores[fighter3-1].getVitorias() + 1);
                        lista_lutadores[fighter3-1].setVida(100);
                        lista_lutadores[fighter4-1].setDerrotas(lista_lutadores[fighter4-1].getDerrotas() + 1);
                        lista_lutadores[fighter4-1].setVida(100);
                    } else if (lista_lutadores[fighter3-1].isAlive() == false){
                        System.out.println("O lutador " + lista_lutadores[fighter4-1].getNome() + " ganhou");
                        lista_lutadores[fighter4-1].setVitorias(lista_lutadores[fighter4-1].getVitorias() + 1);
                        lista_lutadores[fighter4-1].setVida(100);
                        lista_lutadores[fighter3-1].setDerrotas(lista_lutadores[fighter3-1].getDerrotas() + 1);
                        lista_lutadores[fighter3-1].setVida(100);
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
