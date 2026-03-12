import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {
    public Practice practice = new Practice();
    @Test
    void sont() {
        assertTrue(practice.sont(3));
        assertFalse(practice.sont(1));
        assertFalse(practice.sont(4));
    }

//    @ParameterizedTest
//    @DisplayName("Các trường hợp số dương thông thường")
//    @CsvSource({
//            "True, 3",
//            "False, 1",
//            "False, 4"
//    })

    @Test
    void fibonacci(){
        assertEquals(0, practice.fibonacci(0));
        assertEquals(2, practice.fibonacci(3));
        assertEquals(1, practice.fibonacci(2));
//        assertEquals(0, practice.fibonacci(-1));
    }
}