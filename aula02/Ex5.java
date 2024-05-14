package aula02;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Velocidade 1: ");
        double v1 = sc.nextDouble();
        System.out.print("Distância 2: ");
        double d2 = sc.nextDouble();
        System.out.print("Velocidade 2: ");
        double v2 = sc.nextDouble();
        if (v1 <= 0 || d1 <= 0 || v2 <= 0 || d2 <= 0) {
            System.out.println("Valores inválidos. As velocidades e distâncias devem ser positivas.");
        } 
        else {
            double vm = (d1 + d2) / ((d1 / v1) + (d2 / v2));
            System.out.printf("A velocidade média foi igual a %.2f km/h.", vm);
        }
        sc.close();
        }
}
