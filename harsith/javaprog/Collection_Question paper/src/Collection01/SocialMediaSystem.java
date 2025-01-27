package Collection01;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaSystem {


    private List<Post> posts ;

    public SocialMediaSystem() {
        this.posts =  new ArrayList<>();;
    }

    public void addPost(Post post) {

        posts.add(post);

    }

    public List<Post> collect(String keyword) {
        List<Post> collectedPosts = new ArrayList<Post>();
        for (int i = 0; i < posts.size(); i++) {

            if (posts.get(i).containsKeyword(keyword)) {
                collectedPosts.add(posts.get(i));

            }


        }
        return collectedPosts;

    }

    public void printStatistics() {
        List<String> allHashTags = new ArrayList<String>();
        // Collect all hashtags
        for (int i = 0; i < posts.size(); i++) {
            allHashTags.addAll(posts.get(i).getHashTags());
        }

        // Count and print statistics of hashtags
        for (int i = 0; i < allHashTags.size(); i++) {
            String currentTag = allHashTags.get(i);
            int count = 0;
            for (int j = 0; j < allHashTags.size(); j++) {
                if (allHashTags.get(j).equals(currentTag)) {
                    count++;
                }
            }
            System.out.println(currentTag + ": " + count);
            // Remove other occurrences of the currentTag
            while (allHashTags.contains(currentTag)) {
                allHashTags.remove(currentTag);
            }
            // Decrease i to account for shifted elements after removal
            i--;
        }

    }

}