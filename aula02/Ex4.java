package aula02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido: ");
        double Montante = sc.nextDouble();
        System.out.print("Taxa mensal: ");
        int taxa = sc.nextInt();
        for (int i = 0; i < 3; i++){
            Montante += Montante * taxa/100;
        }
        System.out.println(Montante);
        sc.close();
    }
}
