package Session4.test.XuatSac.XuatSac2;

import static org.junit.jupiter.api.Assertions.*;

import XuatSac.XuatSac2.ProfileService;
import XuatSac.XuatSac2.User;
import XuatSac.XuatSac2.UserProfile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProfileServiceTest {

    ProfileService service = new ProfileService();

    @Test
    @DisplayName("Cập nhật hồ sơ thành công")
    void updateProfile_success() {

        User existing = new User("old@mail.com", LocalDate.of(2000,1,1),"Hung");

        UserProfile newProfile = new UserProfile("new@mail.com", LocalDate.of(2001,1,1),"Hung Nguyen");

        List<User> users = new ArrayList<>();

        User result = service.updateProfile(existing,newProfile,users);

        assertNotNull(result);
    }

    @Test
    @DisplayName("Cập nhật hồ sơ thất bại ngày sinh lớn hơn ngày hiện tại")
    void updateProfile_fail() {

        User existing = new User("old@mail.com", LocalDate.of(2000,1,1),"Hung");

        UserProfile newProfile = new UserProfile("new@mail.com", LocalDate.now().plusDays(1),"Hung");

        List<User> users = new ArrayList<>();

        User result = service.updateProfile(existing,newProfile,users);

        assertNull(result);
    }

    @Test
    @DisplayName("cập nhật thất bại do đã có email đó trong danh sách")
    void updateProfile_fail_hasEmailInList() {
        User existing = new User("old@mail.com", LocalDate.of(2000,1,1),"Hung");

        User another = new User("duplicate@mail.com", LocalDate.of(1999,1,1),"An");

        List<User> users = new ArrayList<>();
        users.add(another);

        UserProfile newProfile = new UserProfile("duplicate@mail.com", LocalDate.of(2001,1,1),"Hung");

        User result = service.updateProfile(existing,newProfile,users);

        assertNull(result);
    }

    @Test
    @DisplayName("Cập nhật thành công email bằng email hiện tại")
    void updateProfile_success_EmailSameCurrent() {

        User existing = new User("same@mail.com", LocalDate.of(2000,1,1),"Hung");

        UserProfile newProfile = new UserProfile("same@mail.com", LocalDate.of(2001,1,1),"Hung Update");

        List<User> users = new ArrayList<>();

        User result = service.updateProfile(existing,newProfile,users);

        assertNotNull(result);
    }

    @Test
    @DisplayName("cập nhật thành công danh sách người dùng rỗng")
    void updateProfile_success_UserListEmpty() {

        User existing = new User("old@mail.com", LocalDate.of(2000,1,1),"Hung");

        UserProfile newProfile = new UserProfile("new@mail.com", LocalDate.of(2001,1,1),"Hung");

        List<User> users = new ArrayList<>();

        User result = service.updateProfile(existing,newProfile,users);

        assertNotNull(result);
    }

    @Test
    @DisplayName("cập nhật thất bại do đã có email và ngày lớn hơn ngày hiện tại")
    void updateProfile_fail_DuplicateEmailAndFutureBirth() {

        User existing = new User("old@mail.com", LocalDate.of(2000,1,1),"Hung");

        User another =
                new User("dup@mail.com", LocalDate.of(1999,1,1),"An");

        List<User> users = new ArrayList<>();
        users.add(another);

        UserProfile newProfile = new UserProfile("dup@mail.com", LocalDate.now().plusDays(1),"Hung");

        User result = service.updateProfile(existing,newProfile,users);

        assertNull(result);
    }
}