package BTTH;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManagement usermanagement = new UserManagement();
//        Tạo User bằng Supplier đã khởi tạo
        User user = usermanagement.createUser("admin1", "admin1", "admin");
//        Kiểm tra username hợp lệ
        boolean isStandardLength = IUserAccount.isStandardLength(user.getUsername());
//        Lấy email của User và in ra bằng Function đã tạo
        String printEmail = usermanagement.printEmail(user);
//        Tạo danh sách User

        List<User> users = Arrays.asList(user, usermanagement.createUser("admin2", "admin2", "admin"), usermanagement.createUser("admin3", "admin3", "admin"), usermanagement.createUser("admin4", "admin4", "admin"));
//        In danh sách
        users.forEach(System.out::println);
    }
}
