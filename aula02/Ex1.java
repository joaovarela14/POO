package aula02;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância em quilómetros: ");
        int dist = sc.nextInt();
        double milhas = dist / 1.609;
        System.out.println(dist + " quilómetros equivale a " + milhas + " milhas");
        sc.close();
    }
    
}
