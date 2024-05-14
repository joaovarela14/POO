package aula02;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coordenadas do ponto P1:");
        System.out.print("x: ");
        float x1 = sc.nextFloat();
        System.out.print("y: ");
        float y1 = sc.nextFloat();

        System.out.println("Coordenadas do ponto P2:");
        System.out.print("x: ");
        float x2 = sc.nextFloat();
        System.out.print("y: ");
        float y2 = sc.nextFloat();

        double distancia = Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));

        System.out.printf("A distância entre o ponto P1(%.0f,%.0f) e o ponto P2(%.0f,%.0f) é igual a %.2f.",
        x1,y1,x2,y2,distancia);
        sc.close();

    }
}
