package aula10;

public class ex3 {
    public static void main(String[] args) {
        StringMap palavra = new StringMap();

        palavra.PorNoMap("Hello World");
        System.out.println(palavra.toString());

        palavra.PorNoMap("Gosto de ananás");
        System.out.println(palavra.toString());
    }
    
}
