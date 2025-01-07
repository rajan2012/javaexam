

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Alice");
        Author author2 = new Author("Bob");

        // Publish articles
        author1.publishArticle();
        author1.publishArticle();
        author2.publishArticle();

        // Display article counts
        Author.displayArticleCounts();
    }
}
