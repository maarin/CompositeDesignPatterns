package composite;

import java.util.ArrayList;
import java.util.List;

public class Thriller implements Movie {
    private final String GENRE = "Thriller";
    private String name;
    List<Movie> thrillerMovies = new ArrayList<>();

    public Thriller (){}

    public Thriller(String name){
        this.name = name;
    }

    @Override
    public void addMovie(Movie movie) {
        this.thrillerMovies.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        this.thrillerMovies.remove(movie);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGenre() {
        return this.GENRE;
    }

    @Override
    public void printMovie() {
        MovieOption.printCatalog(thrillerMovies);
    }
}
