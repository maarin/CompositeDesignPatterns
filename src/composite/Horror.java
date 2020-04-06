package composite;

import java.util.ArrayList;
import java.util.List;

public class Horror implements Movie {
    private final String GENRE = "Horror";
    private String name;
    List<Movie> horrorMovies = new ArrayList<Movie>();

    public Horror(){}

    public Horror(String name){
        this.name = name;
    }

    @Override
    public void addMovie(Movie movie) {
        horrorMovies.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        horrorMovies.remove(movie);
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
        MovieOption.printCatalog(horrorMovies);
    }
}
