import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Bai5 {
    public static void main(String[] args) {
        List<String> users = Arrays.asList("alexander","charlotte","Benjamin","user1","users2","hello12");
        users.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).forEach(System.out::println);
    }
}
