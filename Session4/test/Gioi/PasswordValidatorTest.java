package Session4.test.Gioi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private PasswordValidator passwordValidator;

    @BeforeEach
    void setUp(){
        passwordValidator = new PasswordValidator();
    }

    @Test
    void evaluatePasswordStrength() {
        assertAll("Kiểm tra toàn bộ test case",
                () -> assertEquals("Mạnh", passwordValidator.evaluatePasswordStrength("Abc123!@")),
                () -> assertEquals("Trung bình", passwordValidator.evaluatePasswordStrength("abc123!@")),
                () -> assertEquals("Trung bình", passwordValidator.evaluatePasswordStrength("ABC123!@")),
                () -> assertEquals("Trung bình", passwordValidator.evaluatePasswordStrength("Abcdef!@")),
                () -> assertEquals("Trung bình", passwordValidator.evaluatePasswordStrength("Abc12345")),
                () -> assertEquals("Yếu", passwordValidator.evaluatePasswordStrength("Ab1!")),
                () -> assertEquals("Yếu", passwordValidator.evaluatePasswordStrength("password")),
                () -> assertEquals("Yếu", passwordValidator.evaluatePasswordStrength("ABC12345"))
                );
    }
}