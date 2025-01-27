package Collectionsnew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Post01 {
    private String content;
    private List<String> hashtags;

    public Post01(String content, String hashtags) {
        this.content = content;
       String[] str = hashtags.split("\\s+");
        this.hashtags = new ArrayList<>(Arrays.asList(str));
    }

    public String getContent() {
        return content;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    @Override
    public String toString() {
        return "Post{" + "content='" + content + '\'' + ", hashtags=" + String.join(", ", hashtags) + '}';
    }
}
