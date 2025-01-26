package Collection01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SocialMediaSystem sms = new SocialMediaSystem();

        Post post1 = new Post("Learning Java", "#programming #java #learning");
        sms.addPost(post1);

        Post post2 = new Post("Data Structures", "#programming #data #structures");
        sms.addPost(post2);

        // Collect posts with keyword 'java'
        List<Post> javaPosts = sms.collect("java");
        System.out.println("Posts with 'java':");
        for (Post p : javaPosts) {
            System.out.println(p);
        }

        // Print statistics
        System.out.println("\nHashtag statistics:");
        sms.printStatistics();
    }
}
