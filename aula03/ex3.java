package aula03;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String continuar = "S";
        System.out.println("Tenta adivinhar o número secreto entre 1 e 100");

        while(continuar.equals("S") || continuar.equals("Sim")){
            int numero = random.nextInt(100);
            int resposta =  -5;
            int counter = 0;
            while(resposta!=numero){
                System.out.print("Tentativa: ");
                counter++;
                resposta = sc.nextInt();
                if (resposta< numero){
                    System.out.println("A tua resposta está abaixo da correta");
                }
                else if(resposta > numero){
                    System.out.println("A tua resposta está acima da correta");
                }
            }
            System.out.println("Parabéns! Acertaste! O número correto é "+numero);
            System.out.printf("Foram utilizadas %01d tentativas\n",counter);
            System.out.print("Pretende continuar? Prima (S)im ");
            continuar = sc.next();
        }
        sc.close();
    }
    
}
