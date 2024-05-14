package aula10;
import java.util.*;

public class MapBooks {
    Map<String, List<Book>> genero_livros= new TreeMap<String, List<Book>>();

    public void addBook(String género, Book book) {
        if (!genero_livros.containsKey(género)) {
            genero_livros.put(género, new ArrayList<Book>());
        }

        genero_livros.get(género).add(book);

    }

    public void removeBook(String género, Book book) {
        if (genero_livros.containsKey(género)) {

            if (!genero_livros.get(género).contains(book)){
                System.out.println("Livro: "+ book + " não existe no género: "+ género);
            }
            else{
                genero_livros.get(género).remove(book);
            }
            
            if (genero_livros.get(género).isEmpty()) {
                genero_livros.remove(género);
            }
        }

        else {
            System.out.println("Género" + género + "não existe");
        }
    }
    

    public void modifyBook(String género, Book oldBook, Book newBook) {
        if (genero_livros.containsKey(género)) {
            List<Book> lista_livros = genero_livros.get(género);
            int index = lista_livros.indexOf(oldBook);
            if (index != -1) {
                lista_livros.set(index, newBook);
            }
        }

        else {
            System.out.println("Género" + género + "não existe");
        }
    }

    public String toString() {
        String print = "";
        for (String género : genero_livros.keySet()) {
            print += "\nGénero: " + género + "\n";
            for (Book book : genero_livros.get(género)) {
                print += book.toString() + "\n";
            }
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
            for (Book book : genero_livros.get(género)) {
                System.out.println(book);
            }
        }

    }

    public void printRandomLivro(String género){
        if (genero_livros.containsKey(género)) {
            int index = (int)(Math.random() * genero_livros.get(género).size());
            System.out.println(genero_livros.get(género).get(index));
        }

        else {
            System.out.println("Género" + género + "não existe");
        }
    }
}


