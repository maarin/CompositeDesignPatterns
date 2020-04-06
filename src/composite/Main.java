package composite;

public class Main {
    public static void main(String[] args) {
        Criminal criminalCatalog = new Criminal();
        Comedy comedyCatalog = new Comedy();
        MyMovies myCatalog = new MyMovies();

        Criminal criminal1 = new Criminal("Castle");
        Comedy comedy1 =  new Comedy("Asd");
        Criminal criminal2 = new Criminal("Bones");
        Criminal criminal3 = new Criminal("TEst");

        criminalCatalog.addMovie(criminal2);
        criminalCatalog.addMovie(criminal3);
        criminalCatalog.addMovie(criminal1);
        comedyCatalog.addMovie(comedy1);
        myCatalog.addMovie(criminal1);


        criminalCatalog.printMovie();
        comedyCatalog.printMovie();
        myCatalog.printMovie();
    }
}
