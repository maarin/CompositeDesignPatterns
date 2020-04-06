package composite;

import java.util.ArrayList;
import java.util.List;

public class Comedy implements Movie {
    private final String GENRE = "Comedy";

    private String name;
    List<Movie> comedyMovies = new ArrayList<Movie>();

    public Comedy(String name){
        this.name = name;
    }

    public  Comedy(){}

    @Override
    public void addMovie(Movie movie) {
        this.comedyMovies.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        this.comedyMovies.remove(movie);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGenre() {
        return this.GENRE;
    }

    public void printMovie(){
        MovieOption.printCatalog(comedyMovies);
    }
}
