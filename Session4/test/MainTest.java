package Session4.test;

import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

    @Test
    void sum() {
        System.out.println("Test");
    }

//    @Before
//    public void testBefore(){
//        System.out.println("test before");
//    }

    // @BeforeAll, @AfterAll, @Disable

    @BeforeAll
    static void beforeAllTest(){
        System.out.println("Before All Test");
    }

    @AfterAll
    static void afterAllTest(){
        System.out.println("After All Test");
    }

    @Test
    @DisplayName("Case1")
    void sum1(){
        Main main = new Main();
        Assertions.assertEquals(3,main.sum(1,2));
        Assertions.assertEquals(5,main.sum(2,3));
        Assertions.assertEquals(9,main.sum(4,5));
        Assertions.assertEquals(3,main.sum(1,2));
    }
}