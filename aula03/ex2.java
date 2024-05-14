package aula03;

import java.util.Scanner;

import util.userinput;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Motante investido: ");
        int montante = sc.nextInt();
        while (userinput.intPositivo(montante)== false || montante%1000!=0){
            System.out.print("Motante investido: ");
            montante = sc.nextInt();
        }
        System.out.print("Taxa mensal: ");
        double taxa = sc.nextInt();
        while(taxa < 0 || taxa > 5){
            System.out.print("Taxa mensal: ");
            taxa = sc.nextInt();
        }

        for (int i = 1; i < 13;i++){
            montante+=montante*taxa/100;
            if(i==12){
                System.out.printf("Montante após 12 meses = %02d",montante);

            }
            else{
                System.out.printf("Mês %01d = %02d\n",i,montante);

            }
        
        }
        sc.close();

    }
    
}
