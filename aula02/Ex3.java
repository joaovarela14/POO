package aula02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de água (em quilogramas): ");
        double agua = sc.nextDouble();
        System.out.print("Temperatura inicial: ");
        double inicial = sc.nextDouble();
        System.out.print("Temperatura final: ");
        double finalt = sc.nextDouble();
        double energia = agua * (finalt - inicial ) * 4184;
        System.out.printf("São necessários %.2f Joules para aquecer %.2f kg de água desde %.2f graus até %.2f graus. ", energia,agua, inicial, finalt);

        sc.close();
        
    }
}
