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

    @Override
    public void printMovie() {
        System.out.println("Movie: " + this.name + " Genre: " + this.GENRE);
        for (Movie movie: this.criminalMovies) {
            movie.printMovie();
        }
    }

    
}
