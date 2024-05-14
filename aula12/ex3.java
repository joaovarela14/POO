package aula12;
import java.util.*;
import java.io.*;


public class ex3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new FileReader("src//aula12//movies.txt"));

        ArrayList<Movie> movies = new ArrayList<Movie>();
        TreeSet<String> genres = new TreeSet<String>();
        sc.nextLine();

        while (sc.hasNext()) {
            String[] linha = sc.nextLine().split("\t");
            movies.add(new Movie(linha[0], Double.parseDouble(linha[1]), linha[2], linha[3], Integer.parseInt(linha[4])));
            genres.add(linha[3]);
        }

        movies.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));

        System.out.println("\n--------Print dos filmes-----------\n");

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\n--------Print dos filmes ordenados por Score (decrescente)-----------\n");
        
        movies.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\n--------Print dos filmes ordenados por Running Time (crescente) -----------\n");

        movies.sort((a, b) -> Integer.compare(a.getRunning_time(), b.getRunning_time()));

        for (Movie movie : movies) {
            System.out.println(movie);
        }
        
        System.out.println("\n--------Print dos géneros e número de filmes correspondente -----------\n");

        for (String genre : genres) {
            int numero_filmes = 0;
            for (Movie movie : movies) {
                if (movie.getGenre().equals(genre)) {
                    numero_filmes++;
                }
            }
            System.out.printf("Género: %-8s | Número de filmes:  %-8d\n", genre, numero_filmes);
        }
    

    Scanner input = new Scanner(System.in);

    System.out.print("\nIntroduza o género do filme que pretende: ");
    String genero_utililzador = input.next();

    File ficheirinho = new File("src//aula12//myselection.txt");
    ficheirinho.createNewFile();
    FileWriter fw = new FileWriter(ficheirinho);

    for (Movie movie : movies) {
        if (movie.getGenre().equals(genero_utililzador) && movie.getScore() > 60) {
            fw.write(movie.toString() + "\n");
        }
    }
    
    sc.close();
    input.close();
    fw.close();

    }
    
}
