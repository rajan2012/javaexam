import java.util.Arrays;

 class main {
    public static void main(String[] args) {
        streamingservice service = new streamingservice();

        // Adding movies from your data format
        service.addMovie("A Space Odyssey", Arrays.asList("Sci-Fi", "Documentary"));
        service.addMovie("The Godfather", Arrays.asList("Thriller", "Crime", "Gangster"));
        service.addMovie("inception", Arrays.asList("Sci-Fi", "Thriller"));

        // Display all movies
        System.out.println("All Movies:");
        service.displayAllMovies();

        // Display movies grouped by genre
        System.out.println("\nMovies Grouped by Genre:");
        service.displayMoviesByGenre();
    }
}