package composite;

import java.util.ArrayList;
import java.util.List;

public class MyMovies implements Movie {
    List<Movie> myMovies = new ArrayList<Movie>();

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
        return null;
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
