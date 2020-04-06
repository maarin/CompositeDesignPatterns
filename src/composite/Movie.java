package composite;

public interface Movie {
    public void addMovie(Movie movie);
    public  void removeMovie(Movie movie);

    public String getName();
    public void setName(String name);
    public String getGenre();
    public void printMovie();
}
