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

}
