package aula02;


import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em graus Celsius: ");
        double Celsius = sc.nextDouble();
        double fahr = Celsius * 1.8 + 32;
        String s1 = String.format("%.2f graus Celsius corresponde a %.2f graus Fahrenheit", Celsius, fahr);
        if (s1.contains("graus")){
            s1 = s1.replace("graus", "aksdkasd");
        }
        System.out.println(s1);
        sc.close();
    }
    
}
