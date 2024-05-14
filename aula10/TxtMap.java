package aula10;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TxtMap {
    Set <String> PalavrasMaisQue2 = new HashSet<>();
    Set <String> PalavrasTerminadasEmS = new HashSet<>();
    Set <String> PalavrasIntrusas = new HashSet<>();

    public void TamanhoMaiorQue2(String str){
        if (str.length() > 2){
            PalavrasMaisQue2.add(str);
        }
    }

    public void TermninaEmS(String str){
        if (str.endsWith("s")){
            PalavrasTerminadasEmS.add(str);
        }  
    }

    public void RemoverPalavras(ArrayList<String> palavras){
        for (String str : palavras){
            for(char c :str.toCharArray()){
                if(!Character.isLetter(c)){
                    PalavrasIntrusas.add(str);
                }
                
            }
        }

        palavras.removeAll(PalavrasIntrusas);

        System.out.println(palavras);

    }



    public void print(){
        System.out.println("Palavras com mais de 2 caracteres: " + PalavrasMaisQue2);
        System.out.println("Palavras terminadas em s: " + PalavrasTerminadasEmS);

    }
    
}
