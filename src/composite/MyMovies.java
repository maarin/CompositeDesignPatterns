package composite;

import java.util.ArrayList;
import java.util.List;

public class MyMovies implements Movie {
    private String name;
    List<Movie> myMovies = new ArrayList<Movie>();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addMovie(Movie movie) {
        this.myMovies.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        this.myMovies.remove(movie);
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public String getGenre() {
        return null;
    }

    @Override
    public void printMovie() {
        System.out.println("-----Favourite-----");
        MovieOption.printCatalog(myMovies);
    }
}
