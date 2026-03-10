import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Bai2 {
    public static void main(String[] args) {
        List<User> userFilter = UserRepository.users.stream().filter(v -> v.email().contains("@gmail.com")).toList();
        userFilter.forEach(user -> System.out.println(user.username()));
    }
}
