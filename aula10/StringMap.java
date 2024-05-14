package aula10;
import java.util.*;

public class StringMap {
    String string;
    Map <Character, List<Integer>> letrinhas = new HashMap <Character, List<Integer>>();

    public void PorNoMap(String str){
        for (int c = 0; c < str.length(); c++){
            if (!letrinhas.containsKey(str.charAt(c))){
                letrinhas.put(str.charAt(c),new ArrayList<>());

            }

            letrinhas.get(str.charAt(c)).add(c);
        }
    }

    public String toString(){
        String print = "";

        for (char letra : letrinhas.keySet()) {
            print += letra +" = " + letrinhas.get(letra) +"; ";
        }

        return print;

    }
}
