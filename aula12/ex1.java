package aula12;
import java.util.*;
import java.io.*;

public class ex1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashSet<String> palavras = new HashSet<String>();
        int numeroPalavras = 0;

        Scanner sc = new Scanner(new FileReader("src//aula12//A_cidade_e_as_serras.txt"));
        sc.useDelimiter("[\\p{Punct}\\s]+");

        while (sc.hasNext()) {
            String word = sc.next();
            palavras.add(word);
            numeroPalavras++;
        }

        System.out.println("Numero de palavras: " + numeroPalavras);
        System.out.println("Numero de palavras diferentes: " + palavras.size());




    }
    
}
