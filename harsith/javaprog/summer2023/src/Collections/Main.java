package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SocialMediaSystem sms = new SocialMediaSystem();

        sms.post("Learning Java", "#programming #java #learning");
        sms.post("Data Structures", "#programming #data #structures");

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

