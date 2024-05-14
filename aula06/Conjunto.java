package aula06;

public class Conjunto {

    private int [] lista_numeros;

    public Conjunto() {
        lista_numeros = new int[0];
    }

    public int[] getLista_numeros() {
        return this.lista_numeros;
    }

    public void setLista_numeros(int[] lista_numeros) {
        this.lista_numeros = lista_numeros;
    }


    public void insert(int numero) {
        if(!this.contains(numero)){
            int[] vetor2 = new int[lista_numeros.length+1];

            for (int i=0; i < lista_numeros.length; i++){
                vetor2[i] = lista_numeros[i];
            }
            vetor2[lista_numeros.length] = numero;
            lista_numeros = vetor2;
        }

    }

    public void remove(int numero) {
        if(this.contains(numero)){
            int[] copy = new int[lista_numeros.length-1];
            for (int i = 0, j = 0; i < lista_numeros.length; i++) {
                if (lista_numeros[i] != numero) {
                    copy[j++] = lista_numeros[i];
                }
            }
            lista_numeros = copy;
        }
    }

    public void empty() {
        lista_numeros = new int[0];
    }

    public int size() {
        return lista_numeros.length;
    }

    public Conjunto combine (Conjunto add ){
        Conjunto comb = new Conjunto();
        for (int i = 0; i < lista_numeros.length; i++) {
            comb.insert(lista_numeros[i]);
        }
        for (int i = 0; i < add.size(); i++) {
            comb.insert(add.getLista_numeros()[i]);
        }
        return comb;
    }


    public Conjunto subtract (Conjunto dif ){
        Conjunto resposta = new Conjunto();
        for (int i = 0; i < lista_numeros.length; i++) {
            resposta.insert(lista_numeros[i]);
        }
        for (int i = 0; i < dif.size(); i++) {
            resposta.remove(dif.getLista_numeros()[i]);
        }
        return resposta;
    }

    public Conjunto intersect (Conjunto inter ){
        Conjunto resposta = new Conjunto();
        for(int i = 0; i < lista_numeros.length; i++){
            if(inter.contains(lista_numeros[i])){
                resposta.insert(lista_numeros[i]);
            }
        }
        return resposta;
    }

    public boolean contains (int numero){
        for (int i = 0; i < lista_numeros.length; i++) {
            if (lista_numeros[i] == numero) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
       //converte os elementos do conjunto para string
        String resposta = "";
        for (int i = 0; i < lista_numeros.length; i++) {
            resposta += lista_numeros[i] + " ";
        }
        return resposta;
    }
}
