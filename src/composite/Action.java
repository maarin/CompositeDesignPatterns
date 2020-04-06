package composite;

import java.util.ArrayList;
import java.util.List;

public class Action implements Movie {
    private final String GENRE = "Action";
    private String name;
    List<Movie> actionMovies = new ArrayList<Movie>();

    public Action(){}

    public Action(String name){
        this.name = name;
    }

    @Override
    public void addMovie(Movie movie) {
        this.actionMovies.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        this.actionMovies.remove(movie);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGenre() {
        return this.GENRE;
    }

    @Override
    public void printMovie() {
        MovieOption.printCatalog(actionMovies);
    }

    public void setName(String name) {
        this.name = name;
    }
}
