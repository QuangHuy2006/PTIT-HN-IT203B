package Session4.test.Kha;

import Session4.Kha.UserValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void isValidUsername1() {
        assertTrue(UserValidator.isValidUsername("user123"));
    }

    @Test
    void isValidUsername2() {
        assertFalse(UserValidator.isValidUsername("abc"));
    }

    @Test
    void isValidUsername3() {
        assertFalse(UserValidator.isValidUsername("user name"));
    }
}