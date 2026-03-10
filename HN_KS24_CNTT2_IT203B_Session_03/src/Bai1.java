import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public record User(String name, String email, String status){};
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User us1 = new User("alice", "alice123@gmail.com", "ACTIVE");
        User us2 = new User("bob", "bob123@yahoo.com", "INACTIVE");
        User us3 = new User("charlie", "charlie123@gmail.com", "ACTIVE");
        users.add(us1);
        users.add(us2);
        users.add(us3);

        users.forEach(user -> System.out.println(user));
    }
}