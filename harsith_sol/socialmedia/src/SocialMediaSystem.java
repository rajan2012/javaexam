import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// SocialMediaSystem Class
class SocialMediaSystem {
    private List<Post> posts;

    // Constructor to initialize post list
    public SocialMediaSystem() {
        this.posts = new ArrayList<>();
    }

    // Method to create and add post
    public void post(String content, String hashtags) {
        // Split hashtags and store them in a list
        String[] tagsArray = hashtags.split(" ");
        List<String> tagsList = new ArrayList<>();
        for (String tag : tagsArray) {
            if (tag.startsWith("#")) {
                tagsList.add(tag);
            }
        }

        // Create post and add to list
        Post newPost = new Post(content, tagsList);
        posts.add(newPost);

    }

    // Method to collect posts containing keyword in content or hashtags
    public List<Post> collect(String keyword) {
        List<Post> result = new ArrayList<>();

        for (Post post : posts) {
            // Check if content contains the keyword (case insensitive)
            if (post.getContent().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(post);
                continue;
            }
            // Check if any hashtag contains the keyword (case insensitive)
            for (String tag : post.getHashTags()) {
                if (tag.toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(post);
                    break;
                }
            }
        }
        return result;
    }

    // Method to print hashtag statistics
    public void printStatistics() {
        Map<String, Integer> hashtagCount = new HashMap<>();

        // Count hashtags
        for (Post post : posts) {
            for (String tag : post.getHashTags()) {
                hashtagCount.put(tag, hashtagCount.getOrDefault(tag, 0) + 1);
            }
        }

        // Print the count of each hashtag
        System.out.println("Hashtag Statistics:");
        for (Map.Entry<String, Integer> entry : hashtagCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}