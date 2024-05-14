package aula03;
import java.util.Scanner;
import util.userinput;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número (positivo): ");
        int n = sc.nextInt();
        while(userinput.intPositivo(n)==false){
            System.out.print("Número (positivo): ");
            n = sc.nextInt();
        }
        int soma=0;
        for (int i=1;i<n+1;i++){
            if (userinput.isPrime(i)==true){
                soma+=i;
            }
        }
        if (userinput.isPrime(n) == true){
            System.out.printf("O número %2d é primo.\n",n);
        }
        else{
            System.out.printf("O número %2d não é primo.\n",n);

        }
        System.out.printf("A soma dos números primos até %2d é igual a %2d. ",n, soma);
        
        sc.close();
        
    }

}
