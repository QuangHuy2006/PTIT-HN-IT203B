package Session4.test.Kha;

import Session4.Kha.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void checkRegistrationAge1() {
        assertEquals(true, UserService.checkRegistrationAge(18));
    }

    @Test
    void checkRegistrationAge2() {
        assertEquals(false, UserService.checkRegistrationAge(17));
    }

    @Test
    void checkRegistrationAge3() {
        assertThrows(IllegalArgumentException.class, () -> UserService.checkRegistrationAge(-1));
    }

}