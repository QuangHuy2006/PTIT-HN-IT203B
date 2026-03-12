import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bai6 {
    public static void main(String[] args) {
        Post post1 = new Post(Arrays.asList("java", "backend"));
        Post post2 = new Post(Arrays.asList("python", "data"));
        List<Post> allPosts = Arrays.asList(post1, post2);
        List<String> allTags = allPosts.stream()
                .flatMap(p -> p.tags.stream())
                .collect(Collectors.toList());

        System.out.println(allTags);
    }
}