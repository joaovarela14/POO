package aula02;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundos: ");
        int segundos = sc.nextInt();
        int sinicial = segundos;
        int horas = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;
        System.out.printf("%02d : %02d : %02d \n",horas,minutos,segundos);
        System.out.printf("%02d segundos corresponde a %02d horas %02d minutos e %02d segundos "
        ,sinicial,horas, minutos,segundos);
        sc.close();
    }
}
