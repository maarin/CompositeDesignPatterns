package composite;

import java.util.List;

public class MovieOption {

    public static void printCatalog(List<Movie> movies){
        for (Movie movie: movies) {
            System.out.println("Movie: " + movie.getName() + ", Genre: " + movie.getGenre());
        }
    }

}
