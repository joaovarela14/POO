package aula03_extra;

import java.util.Scanner;
import util.userinput;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();

        System.out.print("Número de dígitos da string: ");
        System.out.println(userinput.contarDigitosNaString(str));

        System.out.print("Número de espaços da string: ");
        System.out.println(userinput.contarEspaçosNaString(str));

        if(minusculas(str) == true){
            System.out.println("A string só contém minusculas");

        }
        else{
            System.out.println("A string não contém apenas minúsculas");
        }
        sc.close();



    }
    public static boolean minusculas(String str){
        String x = str.toLowerCase();

        if (x.equals(str)){
            
            return true;
        }
        else{
            return false;
        }
    }
}
