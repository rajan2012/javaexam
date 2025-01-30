package Collectionsnew;

import java.util.List;

public class Evaluation {
    public static void main(String[] args) {
        SocialMediaSystem01 sms = new SocialMediaSystem01();

        // Adding posts using the post method
        sms.post("Learning Java", "#programming #java #learning");
        sms.post("Data Structures", "#programming #data #structures");

        // Collect posts with keyword 'java'
        List<Post01> javaPosts = sms.collect("java");

        System.out.println("Posts with 'java':");
        for (Post01 p : javaPosts) {
            System.out.println(p);
        }

        // Print statistics
        System.out.println("\nHashtag statistics:");
        sms.printStatistics();
    }
}
