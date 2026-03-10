import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai4 {
    public record userName(String username){};
    public static void main(String[] args) {
        List<userName> userNames = new ArrayList<>(Arrays.asList(new userName("Thu Huyen"), new userName("Hưng"), new userName("Quang")));
        List<userName> distinctUserName = userNames.stream().distinct().toList();

        System.out.println(distinctUserName);
    }
}