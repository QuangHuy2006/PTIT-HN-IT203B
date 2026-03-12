package Session4.test.Gioi;

import Session4.Gioi.UserProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserProcessorTest {
    private UserProcessor processor;
    @BeforeEach
    @DisplayName("Khởi tạo đối tượng trước mỗi bài test")
    void setUp(){
        processor = new UserProcessor();
    }

    @Test
    @DisplayName("Kiểm tra email hợp lệ")
    void checkEmailFormat1(){
        String result = processor.proccessEmail("user@gmail.com");
        assertEquals("user@gmail.com", result);
    }

    @Test
    @DisplayName("Kiểm tra email thiếu @")
    void checkEmailFormat2(){
        assertThrows(IllegalArgumentException.class, () -> processor.proccessEmail("usergmail.com"));
    }

    @Test
    @DisplayName("Kiểm tra email có @ nhưng không có tên miền")
    void checkEmailFormat3(){
        assertThrows(IllegalArgumentException.class, () -> processor.proccessEmail("user@"));
    }

    @Test
    @DisplayName("Kiểm tra email chuẩn hoá")
    void checkEmailFormat4(){
        String result = processor.proccessEmail("Example@Gmail.com");
        assertEquals("example@gmail.com", result);
    }

}