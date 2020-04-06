package composite;

import java.util.ArrayList;
import java.util.List;

public class Criminal implements Movie{
    private final String GENRE = "Criminal";

    private String name;
    List<Movie> criminalMovies = new  ArrayList<Movie>();

    public Criminal(String name){
        this.name = name;
    }

    public Criminal(){

    }

    @Override
    public void addMovie(Movie movie) {
        this.criminalMovies.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        this.criminalMovies.remove(movie);
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
        MovieOption.printCatalog(criminalMovies);
    }
}
