package Session4.test.XuatSac;

import XuatSac.XuatSac1.Action;
import XuatSac.XuatSac1.MainXuatSac1;
import XuatSac.XuatSac1.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainXuatSac1Test {
    @Test
    void testCanPerformAction() {
        assertAll("Kiểm tra toàn bộ phân quyền hệ thống",
                () -> assertTrue(MainXuatSac1.canPerformAction(new User("ADMIN", "DELETE_USER"), new Action("DELETE_USER"))),
                () -> assertTrue(MainXuatSac1.canPerformAction(new User("ADMIN", "LOCK_USER"), new Action("LOCK_USER"))),
                () -> assertTrue(MainXuatSac1.canPerformAction(new User("ADMIN", "VIEW_PROFILE"), new Action("VIEW_PROFILE"))),

                () -> assertFalse(MainXuatSac1.canPerformAction(new User("MODERATOR", "DELETE_USER"), new Action("DELETE_USER"))),
                () -> assertTrue(MainXuatSac1.canPerformAction(new User("MODERATOR", "LOCK_USER"), new Action("LOCK_USER"))),
                () -> assertTrue(MainXuatSac1.canPerformAction(new User("MODERATOR", "VIEW_PROFILE"), new Action("VIEW_PROFILE"))),

                () -> assertFalse(MainXuatSac1.canPerformAction(new User("USER", "DELETE_USER"), new Action("DELETE_USER"))),
                () -> assertFalse(MainXuatSac1.canPerformAction(new User("USER", "LOCK_USER"), new Action("LOCK_USER"))),
                () -> assertTrue(MainXuatSac1.canPerformAction(new User("USER", "VIEW_PROFILE"), new Action("VIEW_PROFILE")))
        );
    }
}