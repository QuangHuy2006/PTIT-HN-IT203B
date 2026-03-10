import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    public static List<User> users = Arrays.asList(
            new User("alice", "user1@gmail.com", "ACTIVATE"),
            new User("alice", "user1@gmail.com", "ACTIVATE"),
            new User("bob", "user2@gmail.com", "INACTIVE"),
            new User("charlie", "user3@gmail.com", "ACTIVATE")
    );

    public static Optional<User> findUserByUsername(String username) {
        return users.stream()
                .filter(v -> v.username().equals(username))
                .findFirst();
    }
}
