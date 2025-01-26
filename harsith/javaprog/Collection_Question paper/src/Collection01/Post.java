package Collection01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Post {

    private String content;
    private List<String> hashTags = new ArrayList<>();


    public Post(String content, List<String> hashTags) {
        this.content = content;
        this.hashTags = hashTags;
    }



    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", hashTags=" + hashTags +
                '}';
    }

    public List<String> getHashTags() {
        return hashTags;


    }

    public boolean containsKeyword(String keyword) {
        if (content.contains(keyword)) {
            return true;
        }
        // Check in hashtags
        for (int i = 0; i < hashTags.size(); i++) {
            if (hashTags.get(i).equals(keyword)) {
                return true;
            }
        }
        return false;
    }
}
