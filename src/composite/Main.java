package composite;

public class Main {
    public static void main(String[] args) {
        Criminal criminal1 = new Criminal("Castle");
        Comedy comedy =  new Comedy("Asd");
        criminal1.printMovie();
        comedy.printMovie();
    }
}
