package aula02;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Começar a contagem no número: ");
        int N = sc.nextInt();

        for (int i = N; i>-1; i--){
            System.out.print(i + ",");
            if (i%10 == 0){
                System.out.print("\n");
            }
        }
        sc.close();
    }
}
