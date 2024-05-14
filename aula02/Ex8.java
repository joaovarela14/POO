package aula02;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Medida do 1º cateto (A): ");
        double cateto1 = sc.nextDouble();

        System.out.print("Medida do 2º cateto (B): ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));  

        double angulo = Math.toDegrees(Math.asin(cateto2/hipotenusa));
        if (cateto1 <= 0 || cateto2 <= 0 ) {
            System.out.println("Valores inválidos.Os catetos devem ser positivos.");
        } 
        else {
            System.out.printf("Um trinâgulo retângulo com catetos iguais a %.2f e %.2f tem hipotenusa igual a %.2f\n",
            cateto1,cateto2,hipotenusa);
            System.out.printf("O ângulo formado entre o lado A e a hipotenusa é igual a %.2f graus", angulo);
        }

        sc.close();
    }
    
}
