package composite;

import java.util.ArrayList;
import java.util.List;

public class AllMovies implements Movie {
    private String genre;
    private String name;

    List<Movie> allMoviesList = new ArrayList<Movie>();

    @Override
    public void addMovie(Movie movie) {
        this.allMoviesList.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        this.allMoviesList.remove(movie);
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
        return this.genre;
    }

    @Override
    public void printMovie() {
        MovieOption.printCatalog(allMoviesList);
    }

    public void printAddedMovie(String name){
        MovieOption.searchByName(this.name, allMoviesList);
    }
}
