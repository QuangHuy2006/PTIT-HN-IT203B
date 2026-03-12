
import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public record User(String name, String email, String status){};
    public static void main(String[] args) {
        List<MainKha1.User> users = new ArrayList<>();
        MainKha1.User us1 = new MainKha1.User("alice", "alice123@gmail.com", "ACTIVE");
        MainKha1.User us2 = new MainKha1.User("bob", "bob123@yahoo.com", "INACTIVE");
        MainKha1.User us3 = new MainKha1.User("charlie", "charlie123@gmail.com", "ACTIVE");
        users.add(us1);
        users.add(us2);
        users.add(us3);

        users.stream().filter(user -> user.email().contains("@gmail")).forEach(user -> System.out.println(user));
    }
}