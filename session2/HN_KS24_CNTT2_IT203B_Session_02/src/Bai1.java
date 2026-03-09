import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Bai1 {
    public static class User {
        String name;
        String role;

        public User(String role, String name) {
            this.role = role;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        User user = new User("user", "name1");
        User user1 = new User("admin", "name2");
//        Kiểm tra xem một User có phải là Admin hay không (trả về true/false).
        Predicate<User> roleValidator = u -> u.role.equals("admin");
        System.out.println(roleValidator.test(user));
        System.out.println(roleValidator.test(user1));
//        Chuyển đổi một đối tượng User thành một chuỗi String chứa thông tin username.
        Function<User, String> getUsername = u -> u.name;
        System.out.println(getUsername.apply(user));
//        In thông tin chi tiết của User ra màn hình Console.
        Consumer<User> detail = u -> System.out.println(u.name);
        detail.accept(user);
//        Khởi tạo một đối tượng User mới với các giá trị mặc định.
        Supplier<User> userSupplier = () -> new User("admin", "name3");
        System.out.println(userSupplier.get().name);
    }
}
