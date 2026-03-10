import Bai1;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bai3 {
    public record User(String name, String email, String status){};
    public static List<User> users = new ArrayList<>();
    public static Optional<User> findUserByUsername(String username){
        return users.stream().filter(user -> user.name().equals("alice")).findFirst();
    }
    public static void main(String[] args) {
        User us1 = new User("alice", "alice123@gmail.com", "ACTIVE");
        User us2 = new User("bob", "bob123@yahoo.com", "INACTIVE");
        User us3 = new User("charlie", "charlie123@gmail.com", "ACTIVE");
        users.add(us1);
        users.add(us2);
        users.add(us3);

        Optional<User> foundUser = findUserByUsername("alice");
        User notUser = foundUser.orElse(new User("Guest", "guest@gmail.com", "INACTIVE"));
        foundUser.ifPresent(user -> {
            System.out.println("Welcome Alice");
        });

        if(notUser.equals("Guest")){
            System.out.println("Guest login");
        }
    }
}