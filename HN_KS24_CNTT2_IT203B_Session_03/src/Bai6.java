import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Định nghĩa record Post
record Post(String title, List<String> tags) {}

public class Bai6 {
    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(
                new Post("Java Tutorial", Arrays.asList("java", "backend")),
                new Post("Python for Data", Arrays.asList("python", "data")),
                new Post("Frontend Basics", Arrays.asList("html", "css"))
        );

        List<String> allTags = posts.stream()
                .flatMap(post -> post.tags().stream())
                .collect(Collectors.toList());

        System.out.println(allTags);
    }
}