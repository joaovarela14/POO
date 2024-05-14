package aula10;
import java.util.Objects;

public class Book {
    //cria um dicionario de dados
    private String titulo;
    private String autor;
    private int ano;

    public Book(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(titulo, book.titulo) && Objects.equals(autor, book.autor) && ano == book.ano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, ano);
    }

    @Override
    public String toString() {
        return "Título = '" + getTitulo() + "'" +
            ", Autor = '" + getAutor() +  "'" +
            ", Ano = " + getAno();
    }
    
}
