package aula03_extra;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(0, 3));


        sc.close();   
    }
}
