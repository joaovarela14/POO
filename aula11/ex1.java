package aula11;
import java.util.*;
import java.io.*;


public class ex1 {
    public static void main(String[] args )throws FileNotFoundException, IOException  {
        Map<String, Map<String, Integer>> mapa = new TreeMap<>();

        Scanner sc = new Scanner(new FileReader("src//aula11//major.txt"));
        sc.useDelimiter("[\\p{Punct}\\s]");

        ArrayList<String> palavras = new ArrayList<>();

        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() > 2) {
                palavras.add(word);
            }
    }

    for(int i = 0; i < palavras.size()-1; i++){
        String atual = palavras.get(i);
        String seguinte = palavras.get(i+1);

        if(!mapa.containsKey(atual)){
            Map<String, Integer> elemento = new HashMap<>();
            elemento.put(seguinte, 1);
            mapa.put(atual, elemento);
        }else{
            if(mapa.get(atual).containsKey(seguinte)){
                mapa.get(atual).replace(seguinte, mapa.get(atual).get(seguinte)+1);
            }else{
                mapa.get(atual).put(seguinte, 1);
            }
        }
    }

    for(String key : mapa.keySet()){
        System.out.println(key + " : " + mapa.get(key));
    }
}
}