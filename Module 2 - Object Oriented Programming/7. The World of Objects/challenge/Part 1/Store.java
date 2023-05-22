public class Store {
    
    private Movie[] movies;



    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int i) {
        return this.movies[i];
    }

    public void setMovie(int i, Movie movie) {
        this.movies[i] = new Movie(movie);
    }


    @Override
    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
