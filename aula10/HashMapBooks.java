package aula10;
import java.util.*;

public class HashMapBooks {
    Map<String, Book> genero_livros= new HashMap<String, Book>();

    public void addBook(String género, Book book) {
        if (!genero_livros.containsKey(género)) {
            genero_livros.put(género, book);
        }

    }

    public void removeBook(String género, Book book) {
        genero_livros.remove(género, book);
    }
    
    public void modifyBook(String género, Book oldBook, Book newBook) {
        genero_livros.replace(género, oldBook, newBook);
    }

    public String toString() {
        String print = "";
        for (String género : genero_livros.keySet()) {
            print += "\nGénero: " + género + "\n";
            print += genero_livros.get(género);
        }
        return print;
    }

    public void printGéneros() {
        for (String género : genero_livros.keySet()) {
            System.out.println("Género: " + género);
        }
    }

    public void printLivros() {
        for (String género : genero_livros.keySet()) {
            System.out.println(genero_livros.get(género)); 
        }

    }






}


