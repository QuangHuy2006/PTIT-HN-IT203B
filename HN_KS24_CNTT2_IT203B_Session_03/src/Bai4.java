import java.util.Map;
import java.util.stream.Collectors;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Mảng ban đầu : ");
        for(User user : UserRepository.users){
            System.out.println(user.username());
        }
        Map<String, User> cleanMap = UserRepository.users.stream()
                .collect(Collectors.toMap(
                        User::username,
                        user -> user,
                        (existing, replacement) -> existing
                ));
        System.out.println("Mảng sau khi lọc : ");
        for(String username : cleanMap.keySet()) {
            System.out.println(cleanMap.get(username).username());
        }
    }
}
