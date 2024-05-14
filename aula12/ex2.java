package aula12;
import java.util.*;
import java.io.*;

public class ex2 {
    public static void main(String[] args)  throws FileNotFoundException, IOException  {
        TreeMap<Character, TreeMap<String, Integer> > palavras = new TreeMap<Character, TreeMap<String, Integer>>();

        Scanner sc = new Scanner(new FileReader("src//aula12//A_cidade_e_as_serras.txt"));
        sc.useDelimiter("[\\p{Punct}\\s]+");

        while (sc.hasNext()) {
            String word = sc.next();

            word = word.toLowerCase();

            char inicial = word.charAt(0);

            if (palavras.containsKey(inicial)) {
                TreeMap<String, Integer> temp = palavras.get(inicial);
                if (temp.containsKey(word)) {
                    temp.put(word, temp.get(word) + 1);
                } else {
                    temp.put(word, 1);
                }
            } else {
                TreeMap<String, Integer> temp = new TreeMap<String, Integer>();
                temp.put(word, 1);
                palavras.put(inicial, temp);
            }
        }
        File ficheirinho = new File("src//aula12//Ex2_aula12.txt");
        ficheirinho.createNewFile();
        FileWriter fw = new FileWriter(ficheirinho);

        for (Map.Entry<Character, TreeMap<String,Integer>> entry : palavras.entrySet()) {
            System.out.println();

            Character key = entry.getKey();
            TreeMap<String,Integer> value = entry.getValue();
            System.out.print(key+": ");
            for (Map.Entry<String,Integer> entry2 : value.entrySet()) {
                String key2 = entry2.getKey();
                Integer value2 = entry2.getValue();
                System.out.print(key2+", "+value2+"; ");
                fw.write(key2+", "+value2+"; ");
            }
            fw.write("\n");
        }

        fw.close();



    }
}
