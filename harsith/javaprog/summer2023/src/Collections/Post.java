package Collections;
import java.util.*;

public class Post {

    private String content;
    private List<String> hashtags = new ArrayList<>();

    public Post(String content, String hashtags) {
        this.content = content;
        String[] str = hashtags.split("\\s+");
        this.hashtags.addAll(Arrays.asList(str));


    }

    public String getContent() {
        return content;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    private void addHashtags(String Hashtags) {
        this.hashtags.add(Hashtags);
    }


    @Override
    public String toString() {
        String res_hashtag = String.join(",", this.hashtags);
        return "Post{" +
                "content='" + content + '\'' +
                ", hashtags=" + res_hashtag +
                '}';
    }
}
