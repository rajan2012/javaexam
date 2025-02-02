package Collections;

import java.util.*;

public class SocialMediaSystem {
    private List<Post> posts ;

    public SocialMediaSystem() {

        this.posts = new ArrayList<Post>();
    }

    public void post(String content, String hashTags) {

        String [] tags = hashTags.split("\\s+");

        List<String> tagList = new ArrayList<>(Arrays.asList(tags));


        Post newPost = new Post(content, hashTags);

        posts.add(newPost);

    }


    public List<Post> collect(String keyword) {
        List<Post> matchingPosts = new ArrayList<>();
        // for (int i = 0; i < posts.size(); i++) {
        //    Post post = posts.get(i);

        for (Post post123 : posts) {

            String var=post123.toString().toLowerCase();
            if (var.contains(keyword.toLowerCase())) {
                matchingPosts.add(post123);
            }

        }
        // Combine the content and hashtags into a single string for comparis
        return matchingPosts;
    }

    public void printStatistics() {
        Map<String, Integer> hashtagFrequency = new HashMap<>();
        // Collect frequencies of each hashtag
        for (Post post : posts) {
            for (String hashtag : post.getHashtags()) {
                hashtagFrequency.put(hashtag, hashtagFrequency.getOrDefault(hashtag, 0) + 1);
            }
        }

        // Print each hashtag and its frequency
        for (Map.Entry<String, Integer> entry : hashtagFrequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    @Override
    public String toString() {
        return "SocialMediaSystem{" +
                "posts=" + posts +
                '}';
    }
}

