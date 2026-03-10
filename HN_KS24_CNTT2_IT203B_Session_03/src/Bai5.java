import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Bai5 {
    public record userName(String name){};

    public static void main(String[] args) {
        List<userName> names = new ArrayList<>(Arrays.asList(new userName("alexander"), new userName("charlotte"), new userName("Benjamin"), new userName("Quang")));
        List<userName> topName =  names.stream().sorted(Comparator.comparing(userName::name).reversed()).limit(3).toList();
        System.out.println(topName);
    }
}