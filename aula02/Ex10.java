package aula02;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Número inicial: ");

        double inicial = sc.nextDouble();
        double maximo = inicial;
        double minimo = inicial;
        double soma = inicial;
        int counter = 1;
        System.out.println("Se quiser terminar insira um número igual a " + inicial);
        
        while (true) {
            System.out.print("Número: ");
            double numero = sc.nextDouble();

            counter++;
            soma += numero;

            if (numero == inicial) {
                System.out.println("FIM");
                break;
            }
            
            if (numero > maximo) {
                maximo = numero;
            }
            
            if (numero < minimo) {
                minimo = numero;
            }
        }

        double media = soma / counter;
        
        System.out.println("O valor máximo introduzido é: " + maximo);
        System.out.println("O valor mínimo é: " + minimo);
        System.out.printf("A média dos valores introduzidos é: %.2f \n",media);
        System.out.println("O total de números lidos é: " + counter);
        
        sc.close();
    }

}

