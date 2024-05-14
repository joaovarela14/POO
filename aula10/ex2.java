package aula10;

public class ex2 {
    public static void main(String[] args) {
        MapBooks library = new MapBooks();

        Book book1 = new Book("A Divina Comédia", "Dante Alighieri", 1320);
        Book book2 = new Book("Grande Sertão: Veredas", "João Guimarães Rosa", 1956);
        Book book3 = new Book("1984", "George Orwell", 1949);
        Book book4 = new Book("O Processo", "Franz Kafka", 1925);
        Book book5 = new Book("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        Book book7 = new Book("The Silmarillion", "J. R. R. Tolkien", 1977);
        Book book8 = new Book("The Hunger Games", "Suzanne Collins", 2008);
        Book book9 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);
 
        library.addBook("Poesia", book1);
        library.addBook("Poesia", book7);
        library.addBook("Romance", book2);
        library.addBook("Ficção Científica", book3);
        library.addBook("Ficção Científica", book8);
        library.addBook("Romance", book4);
        library.addBook("Romance", book5);

        System.out.println("\n------Print do map-----");
        System.out.println(library.toString());
        
        System.out.println("\n------Print dos géneros-----");
        library.printGéneros();
        
        System.out.println("\n------Print dos livros-----");
        library.printLivros();

        System.out.println("\n------Print Random de um livro-----");
        System.out.print("Poesia: ");
        library.printRandomLivro("Poesia");
        System.out.print("Romance: ");
        library.printRandomLivro("Romance");
        System.out.print("Ficção Científica: ");
        library.printRandomLivro("Ficção Científica");

        System.out.println("\n-------------------Prints após alterações-------------------");

        library.removeBook("Romance", book5);
        library.removeBook("Romance", book1);
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
