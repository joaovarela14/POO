package aula10;
import java.util.*;
import java.io.*;



public class ex4 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("src//aula10//words.txt"));
        TxtMap ficheirinho = new TxtMap();
        ArrayList <String> palavras = new ArrayList<>();
        while (input.hasNext()) {
            String word = input.next();
            palavras.add(word);
            ficheirinho.TamanhoMaiorQue2(word);
            ficheirinho.TermninaEmS(word);   
        }

        input.close();

        ficheirinho.print();
        System.out.print("Palavras apenas com letras: ");
        ficheirinho.RemoverPalavras(palavras);
       
    }
    
}
