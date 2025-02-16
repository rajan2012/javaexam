import java.util.List;

// Main Class to test the functionality
public class Main {
    public static void main(String[] args) {
        SocialMediaSystem sms = new SocialMediaSystem();

        // Creating Posts
        sms.post("Learning Java is fun!", "#java #coding #education");
        sms.post("Exploring data science techniques.", "#data #science #analytics");
        sms.post("Good luck to all students!", "#students #goodluck");
        sms.post("Computer science is amazing.", "#computer #science");
        sms.post("Good vibes only.", "#goodvibes #happy");

        // Collecting Posts containing the keyword "good"
        System.out.println("\nCollecting Posts with keyword 'good':");
        List<Post> collectedPosts = sms.collect("good");
        for (Post post : collectedPosts) {
            System.out.println(post);
        }

        // Printing Hashtag Statistics
        System.out.println("\nHashtag Statistics:");
        sms.printStatistics();
    }
}