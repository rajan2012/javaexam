import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.list;

public class streamingservice {

    List<Movie> m;

    Map<String, List<Movie>> m2;

    public streamingservice()
    {
        this.m=new ArrayList<>();
    }

    void addMovie(String title, List<String> genres)
    {
        m.add(new Movie(title,genres));

    }

    public Map<String, List<Movie>> getGenreMap() {
        Map<String, List<Movie>> genreMap = new HashMap<>();

        for (Movie movie : m) {
            for (String genre : movie.getGenres()) {
                // If genre is not present, add an empty list
                genreMap.putIfAbsent(genre, new ArrayList<>());

                // Add movie to the list for this genre
                genreMap.get(genre).add(movie);
            }
        }

        return genreMap;
    }

    public void displayMoviesByGenre() {
        Map<String, List<Movie>> genreMap = getGenreMap();

        for (Map.Entry<String, List<Movie>> entry : genreMap.entrySet()) {
            System.out.println("Genre: " + entry.getKey());
            for (Movie movie : entry.getValue()) {
                System.out.println("   " + movie.getTitle());
            }
        }
    }

    public void displayMoviesByGenre2() {
        Map<String, List<Movie>> genreMap = getGenreMap();

        for (String k:genreMap.keySet()) {
            System.out.println("Genre: " + k);
            for (Movie movie : genreMap.get(k)) {
                System.out.println("   " + movie.getTitle());
            }
        }
    }

    public void displayAllMovies() {
        for (Movie movie : m) {
            System.out.println(movie);
        }
    }


}
