import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Post Class
class Post {
    private String content;
    private List<String> hashTags;

    // Constructor
    public Post(String content, List<String> hashTags) {
        this.content = content;
        this.hashTags = hashTags;
    }

    // Getters
    public String getContent() {
        return content;
    }

    public List<String> getHashTags() {
        return hashTags;
    }

    @Override
    public String toString() {
        return "Post: " + content + " | Hashtags: " + hashTags;
    }
}


