import java.util.HashMap;
import java.util.Map;

// Class representing an Author
class Author {
    private String name;
    private static Map<String, Integer> articleCounts = new HashMap<>(); // Tracks article counts by author name

    // Constructor to initialize the author
    public Author(String name) {
        this.name = name;
    }

    // Method to publish an article
    public void publishArticle() {
        articleCounts.put(name, articleCounts.getOrDefault(name, 0) + 1);
    }

    // Static method to display article counts for all authors
    public static void displayArticleCounts() {
        System.out.println("Number of articles published by each author:");
        for (Map.Entry<String, Integer> entry : articleCounts.entrySet()) {
            System.out.println("Author: " + entry.getKey() + ", Articles: " + entry.getValue());
        }
    }
}