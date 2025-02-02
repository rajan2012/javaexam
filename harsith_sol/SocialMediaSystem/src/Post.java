import java.util.List;

public class Post {

    List<String> hastag;

    String content;

    public Post(String content, List<String> hastag)
    {
        this.content=content;
        this.hastag=hastag;
    }

    String getContent()
    {
        return content;
    }

    List<String> getHastag()
    {
        return hastag;
    }

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", hashTags=" + hastag +
                '}';
    }
}
