import java.lang.reflect.Array;
import java.util.*;

public class SocialMediaSystem {

    List<Post> p;


    public SocialMediaSystem()
    {
        p=new ArrayList<>();
    }

    void post(String content,String hashtag)
    {
        //way to make in required form if asked
        hashtag="#"+hashtag+" ";
        p.add(new Post(content, Arrays.asList(hashtag)));
    }

    public void post2(String content, String hashTags) {
        // Convert hashtags string into a list
        List<String> hashTagList = List.of(hashTags.split(" "));
        // Create Post object
        Post newPost = new Post(content, hashTagList);
        // Add post to the list
        p.add(newPost);
    }

    List<Post> collect(String keyword)
    {
        boolean flag=true;
        List<Post> p4=new ArrayList<>();
        for(Post p1:p)
        {
            if(p1.getContent().contains(keyword)||p1.getHastag().contains(keyword))
            {
                p4.add(p1);
            }
        }

        return p4;
    }


    void printStatistics() {

        Map<String, Integer> m = new HashMap<>();
        //list of post
        for (Post p3 : p) {
            //list of content
            for (String p4 : p3.getHastag()) {
                //splititng content based on space
                String[] s10 = p4.split(" ");
                for (String s11 : s10) {
                    m.put(s11, m.getOrDefault(s11, 0) + 1);
                }
            }

        }

        for(String s:m.keySet())
        {
            System.out.println("key "+s+" has count: "+m.get(s));
        }

    }


}
