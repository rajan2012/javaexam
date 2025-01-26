package Collectionsnew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SocialMediaSystem01 {
    private List<Post01> posts;

    public SocialMediaSystem01() {
        this.posts = new ArrayList<>();
    }

    public void post(String content, String hashtags) {
        Post01 newPost = new Post01(content, hashtags);
        posts.add(newPost);
    }

    public List<Post01> collect(String keyword) {
        List<Post01> postMatches = new ArrayList<>();
        for (Post01 postNew : posts) {
            if (postNew.getContent().toLowerCase().contains(keyword.toLowerCase()) ||
                    postNew.getHashtags().contains(keyword.toLowerCase()))
            {
                postMatches.add(postNew);
            }
        }
        return postMatches;
    }

    public void printStatistics() {
        Map<String, Integer> hashTagCount = new HashMap<>();
        for (Post01 post : posts) {
            for (String tag : post.getHashtags()) {
                hashTagCount.put(tag, hashTagCount.getOrDefault(tag, 0) + 1);
            }
        }
        hashTagCount.forEach((tag, count) -> System.out.println(tag + ": " + count));
    }

    @Override
    public String toString() {
        return "SocialMediaSystem{" + "posts=" + posts + '}';
    }
}
