package aula12;
import java.util.Objects;

public class Movie {
    String name, rating , genre;
    double score;
    int running_time;


    public Movie(String name,double score, String rating, String genre,  int running_time) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.score = score;
        this.running_time = running_time;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getRunning_time() {
        return this.running_time;
    }

    public void setRunning_time(int running_time) {
        this.running_time = running_time;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && Objects.equals(rating, movie.rating) && Objects.equals(genre, movie.genre) && score == movie.score && running_time == movie.running_time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, genre, score, running_time);
    }

    @Override
    public String toString() {
        return String.format("%-30s %-5s %-10s %-10s %-5s", name, score, rating, genre, running_time);
    }
     
}
