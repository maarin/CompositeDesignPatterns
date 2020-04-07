package composite;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyMovies myCatalog = new MyMovies();
        AllMovies allMoviesCatalog = new AllMovies();
        Action actionCatalog = new Action();
        Criminal criminalCatalog = new Criminal();
        Comedy comedyCatalog = new Comedy();
        Horror horrorCatalog = new Horror();
        Thriller thrillerCatalog = new Thriller();

        Criminal prisoners = new Criminal("Prisoners");
        Comedy mayorPain =  new Comedy("Mayor Pain");
        Criminal bones = new Criminal("Bones");
        Criminal castle = new Criminal("Castle");
        Comedy euroTrip = new Comedy("Euro trip");
        Action johnWick = new Action("John Wick");
        Action taken = new Action("Taken");
        Horror conjuring = new Horror("The Conjuring");
        Horror conjuring2 = new Horror("The Conjuring 2");
        Thriller theSilenceOfTheLambs = new Thriller("The silence of the lambs");
        Thriller se7en = new Thriller("Se7en");

        criminalCatalog.addMovie(bones);
        criminalCatalog.addMovie(castle);
        criminalCatalog.addMovie(prisoners);
        comedyCatalog.addMovie(mayorPain);
        comedyCatalog.addMovie(euroTrip);
        actionCatalog.addMovie(johnWick);
        actionCatalog.addMovie(taken);
        horrorCatalog.addMovie(conjuring);
        horrorCatalog.addMovie(conjuring2);
        thrillerCatalog.addMovie(theSilenceOfTheLambs);
        thrillerCatalog.addMovie(se7en);

        allMoviesCatalog.addMovie(castle);
        allMoviesCatalog.addMovie(taken);


        myCatalog.addMovie(prisoners);

        criminalCatalog.printMovie();
       comedyCatalog.printMovie();
       myCatalog.printMovie();

    }
}
