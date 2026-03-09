import java.util.function.Predicate;

public class Bai2 {
    public static void main(String[] args) {
//        String password = "123456789";
        String password = "123456";
        Predicate<String> validator = u -> u.length() >= 8;
        System.out.println(validator.test(password));
    }
}
