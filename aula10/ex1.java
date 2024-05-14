package aula10;

public class ex1 {
    public static void main(String[] args) {
        HashMapBooks library = new HashMapBooks();

        Book book1 = new Book("A Divina Comédia", "Dante Alighieri", 1320);
        Book book2 = new Book("Grande Sertão: Veredas", "João Guimarães Rosa", 1956);
        Book book3 = new Book("1984", "George Orwell", 1949);

 
        library.addBook("Poesia", book1);
        library.addBook("Romance", book2);
        library.addBook("Ficção Científica", book3);

        System.out.println("\n------Print do map-----");
        System.out.println(library.toString());
        
        System.out.println("\n------Print dos géneros-----");
        library.printGéneros();
        
        System.out.println("\n------Print dos livros-----");
        library.printLivros();

        System.out.println("\n-------------------Print após alterações-------------------");

        library.removeBook("Ficção Científica", book3);
        library.modifyBook("Romance", book2, new Book("Dom Casmurro", "Machado de Assis", 1899));
        Book book6 = new Book("IT", "Stephen King", 2000);
        library.addBook("Terror",book6 );


        System.out.println(library.toString());

        System.out.println("\n------Print dos géneros-----");
        library.printGéneros();

        System.out.println("\n------Print dos livros-----");
        library.printLivros();
    }
    
}
