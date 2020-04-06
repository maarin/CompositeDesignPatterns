package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieOption {
    private static Scanner scanner = new Scanner(System.in);;

    public static void printCatalog(List<Movie> movies){
        for (Movie movie: movies) {
            System.out.println("Movie: " + movie.getName() + ", Genre: " + movie.getGenre());
        }
    }

    public static Object addFavouriteMovie(Movie movies, String name, MyMovies myMovies){
        String input = scanner.nextLine();

        if(input.equals(name)){
            System.out.printf("%s added in favourite!%n", name);
            movies.getName();
            movies.setName(name);
            myMovies.addMovie(movies);
            return myMovies;
        }else{
            System.out.println("There isn't a movie with this name.");
            return null;
        }
    }

    public static void chooseOption(Movie movies, String name, MyMovies myMovies){
        String input = scanner.nextLine();

        if(input.equals("a")){
            addFavouriteMovie(movies, name, myMovies);
        }if(input.equals("r")){
            //methodForRemove
        }else {
            System.out.println("Invalid option!");
        }
    }

    public static Object searchByName (String name, List<Movie> movies){
        MyMovies myMovies = new MyMovies();

        for (Movie movie: movies) {
            if(movie.getName().equals(name)){
                myMovies.addMovie(movie);
                return myMovies;
            }
        }

        return null;
    }
}
