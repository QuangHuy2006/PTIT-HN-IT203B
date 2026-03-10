import java.util.Optional;

public class Bai3 {
    public static void main(String[] args) {
        Optional<User> userOpt = UserRepository.findUserByUsername("alice");
        if(userOpt.isPresent()) {
            System.out.println("Welcome " + userOpt.get().username());
        }else{
            System.out.println("Guest Login");
        }

    }
}
