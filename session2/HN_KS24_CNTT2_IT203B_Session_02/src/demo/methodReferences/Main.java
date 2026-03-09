package demo.methodReferences;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // tham chiếu của 1 phương thức
        // duyệt qua 1 danh sách tên học sinh và in ra màn hình
        List<String> name = Arrays.asList("hi","ho","hu","he");

        name.forEach(Printer::print);

        // cách sử dụng
        /*
        ClassName::method
        objName::method
        ClassName::new (hàm tạo)
        *
        * */

        // biến đổi thành danh sách Student

        List<Student> students = name.stream().map(Student::new).toList();

        // lọc ra những sinh viên trong tên có chứa chữ e

        students.stream().filter(student -> student.name.contains("e")).forEach(System.out::println);

        // 4 phương thức cơ bản : map, filter, foreach, reduce



    }
}
