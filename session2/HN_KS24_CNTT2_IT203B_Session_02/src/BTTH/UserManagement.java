package BTTH;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserManagement {
    public User createUser(String username, String password, String role) {
        Supplier<User> userSupplier = () -> new User(username,password,role,"activate");
        return userSupplier.get();
    }

    public boolean checkRole(User user){
        Predicate<User> userPredicate = u -> u.getStatus().equals("active");
        return userPredicate.test(user);
    }

    public String printEmail(User user){
        Function<User,String> userFunction = User::getEmail;
        return userFunction.apply(user);
    }
}
